package com.example6.Tic.Tac.Toe.Board;

import com.example6.Tic.Tac.Toe.Exceptions.InvalidMoveException;
import com.example6.Tic.Tac.Toe.Pieces.Piece;
import com.example6.Tic.Tac.Toe.Pieces.PieceFactory;
import com.example6.Tic.Tac.Toe.Pieces.PieceType;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope("prototype")
public class Board {
    List<List<Piece>> pieceList;
    private final int size;
    private final PieceFactory pieceFactory;

    public Board(int size, PieceFactory pieceFactory) {
        this.size = size;
        this.pieceFactory = pieceFactory;
        pieceList = new ArrayList<>();

        for (int i = 0; i<size; i++){
            List<Piece> row = new ArrayList<>();
            for (int j = 0; j<size; j++){
                row.add(pieceFactory.createPiece(PieceType.EMPTY));
            }
            pieceList.add(row);
        }
    }

    public GameState addPiece(int row, int col, PieceType pieceType) {
        if (row < 0 || col < 0 || row >= size || col >= size) {
            throw new InvalidMoveException("Invalid move! Coordinates are out of bounds.");
        }
        if (pieceList.get(row).get(col).getPieceType() != PieceType.EMPTY) {
            throw new InvalidMoveException("Invalid move! The cell is already occupied.");
        }

        Piece piece = pieceFactory.createPiece(pieceType);
        pieceList.get(row).set(col, piece);

        return checkGameState(row, col, pieceType);
    }

    private GameState checkGameState(int row, int col, PieceType pieceType){

        boolean rowWin = true;
        for (int j = 0; j < size; j++) {
            if (pieceList.get(row).get(j).getPieceType() != pieceType) {
                rowWin = false;
                break;
            }
        }

        boolean colWin = true;
        for (int i = 0; i < size; i++) {
            if (pieceList.get(i).get(col).getPieceType() != pieceType) {
                colWin = false;
                break;
            }
        }

        boolean mainDiagonalWin = (row == col);
        if (mainDiagonalWin) {
            for (int i = 0; i < size; i++) {
                if (pieceList.get(i).get(i).getPieceType() != pieceType) {
                    mainDiagonalWin = false;
                    break;
                }
            }
        }

        boolean antiDiagonalWin = (row + col == size - 1);
        if (antiDiagonalWin) {
            for (int i = 0; i < size; i++) {
                if (pieceList.get(i).get(size - 1 - i).getPieceType() != pieceType) {
                    antiDiagonalWin = false;
                    break;
                }
            }
        }

        if (rowWin || colWin || mainDiagonalWin || antiDiagonalWin) {
            return GameState.WIN;
        }

        // Check for draw
        for (List<Piece> rowList : pieceList) {
            for (Piece piece : rowList) {
                if (piece.getPieceType() == PieceType.EMPTY) {
                    return GameState.CONTINUE;
                }
            }
        }

        return GameState.DRAW;
    }

    public void showBoard(){
        for (int i = 0; i<size; i++){
            for (int j = 0; j<size; j++){
                System.out.print(pieceList.get(i).get(j).getPieceType().getDisplayName());
                if (j != size-1) System.out.print(" | ");
            }
            System.out.println();
        }
    }
    public List<List<Piece>> getPieceList() {
        return pieceList;
    }

    public int getSize() {
        return size;
    }
}
