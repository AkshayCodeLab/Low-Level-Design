package com.example6.Tic.Tac.Toe.Player;

import com.example6.Tic.Tac.Toe.Pieces.Piece;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public abstract class PlayerFactory {

    @Lookup
    public Player createPlayer(String name, Piece piece) {
        return null;
    }
}
