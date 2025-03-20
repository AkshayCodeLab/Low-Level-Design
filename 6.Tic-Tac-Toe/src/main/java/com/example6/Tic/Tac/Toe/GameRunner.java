package com.example6.Tic.Tac.Toe;

import com.example6.Tic.Tac.Toe.Board.Board;
import com.example6.Tic.Tac.Toe.Board.GameState;
import com.example6.Tic.Tac.Toe.Pieces.Piece;
import com.example6.Tic.Tac.Toe.Pieces.PieceFactory;
import com.example6.Tic.Tac.Toe.Pieces.PieceType;
import com.example6.Tic.Tac.Toe.Player.Player;
import com.example6.Tic.Tac.Toe.Player.PlayerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

@Component
public class GameRunner implements ApplicationRunner {
    private final Deque<Player> players;
    private Board board;
    private final PlayerFactory playerFactory;
    private final Scanner scanner;
    private final ApplicationContext context;
    private final PieceFactory pieceFactory;

    @Autowired
    public GameRunner(PlayerFactory playerFactory, ApplicationContext context, PieceFactory pieceFactory){
        this.playerFactory = playerFactory;
        this.scanner = new Scanner(System.in);
        players = new ArrayDeque<>();
        this.context = context;
        this.pieceFactory = pieceFactory;

    }
    @Override
    public void run(ApplicationArguments args){
        System.out.println("Game Started! \n Enter the Size of the board:");
        players.addLast(playerFactory.createPlayer("1", pieceFactory.createPiece(PieceType.O)));
        players.addLast(playerFactory.createPlayer("2", pieceFactory.createPiece(PieceType.X)));

        int size;
        while (true) {
            try {
                size = scanner.nextInt();
                if (size < 3) {
                    System.out.println("Board size must be at least 3. Try again:");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number:");
                scanner.next();
            }
        }
        board = context.getBean(Board.class, size, pieceFactory);
        System.out.println("Board initialized with size: " + size);
        board.showBoard();
        startGame();
    }

    private void startGame()  {
        GameState state = GameState.CONTINUE;
        Player current = players.getFirst();
        while (state == GameState.CONTINUE){
            current = players.pollFirst();
            players.addLast(current);
            System.out.println("Player " + current.getName() + "'s turn: ");

            while (true){
                int row, col;
                row = scanner.nextInt();
                col = scanner.nextInt();
                try {
                   state = board.addPiece(row, col, current.getPiece().getPieceType());
                   break;

                }catch (Exception e){
                    System.out.println(e.getMessage());
                    continue;
                }
            }
            board.showBoard();
        }

        if (state == GameState.WIN){
            System.out.println("Player : " + current.getName() + " Won!");
        }
        else System.out.println("The game resulted in a draw!");

    }
}
