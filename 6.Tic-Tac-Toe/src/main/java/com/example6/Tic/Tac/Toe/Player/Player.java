package com.example6.Tic.Tac.Toe.Player;

import com.example6.Tic.Tac.Toe.Pieces.Piece;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Player {
    private final String name;
    private final Piece piece;

    public String getName() {
        return name;
    }

    public Piece getPiece() {
        return piece;
    }

    public Player(String name, Piece piece) {
        this.name = name;
        this.piece = piece;
    }
}
