package com.kata.tictactoe;

enum Player {
    X('X'), O('0');

    private char symbol;

    Player(char symbol) {
        this.symbol = symbol;
    }

    char getPlayerSymbol() {
        return this.symbol;
    }

    Player switchPlayer(char playerSymbol) {
        return Player.O;
    }
}
