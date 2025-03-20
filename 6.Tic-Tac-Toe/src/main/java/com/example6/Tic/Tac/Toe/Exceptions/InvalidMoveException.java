package com.example6.Tic.Tac.Toe.Exceptions;

public class InvalidMoveException extends RuntimeException {
    public InvalidMoveException(String message){
        super(message);
    }
}
