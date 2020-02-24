package com.kata.tictactoe;

enum Player {
    X('X');

    private char symbol;

    Player(char symbol) {
        this.symbol = symbol;
    }

    char getPlayerSymbol() {
        return this.symbol;
    }
}
