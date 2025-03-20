package com.example6.Tic.Tac.Toe.Pieces;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public abstract class  PieceFactory {

    @Lookup
    public abstract Piece createPiece(PieceType pieceType);
}
