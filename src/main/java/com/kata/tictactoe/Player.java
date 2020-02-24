package com.kata.tictactoe;

public enum Player {
    X('X');

    private char symbol;

    Player(char symbol) {
        this.symbol = symbol;
    }

    public char getPlayerSymbol() {
        return this.symbol;
    }
}
