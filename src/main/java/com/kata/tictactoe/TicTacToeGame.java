package com.kata.tictactoe;

class TicTacToeGame {

    private static final String EMPTY_STRING = "";
    private TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();

    String playGame(int row, int col, char value) {
        ticTacToeBoard.setValue(row,col,value);
        if (ticTacToeBoard.isBoardFull()) {
            return "Game is Draw!";
        }
        return EMPTY_STRING;
    }
}
