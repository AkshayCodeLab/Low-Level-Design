package com.example6.Tic.Tac.Toe.Pieces;

public enum PieceType {
    X("X"),
    O("O"),
    EMPTY(" ");

    private final String displayName;

    PieceType(String displayName){
        this.displayName = displayName;
    }

    public String getDisplayName(){
        return displayName;
    }
}
