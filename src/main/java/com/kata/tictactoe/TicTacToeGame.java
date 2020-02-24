package com.kata.tictactoe;

class TicTacToeGame {

    private static final String EMPTY_STRING = "";
    private static final String GAME_IS_DRAW = "Game is Draw!";
    private TicTacToeBoard ticTacToeBoard;

    TicTacToeGame(TicTacToeBoard ticTacToeBoard) {
        this.ticTacToeBoard = ticTacToeBoard;
    }

    String playGame(int row, int col, char value) {
        if (ticTacToeBoard.isPositionOccupied(row,col)) {
            return "Position is Invalid!";
        }
        ticTacToeBoard.setValue(row,col,value);
        if (ticTacToeBoard.isBoardFull()) {
            return GAME_IS_DRAW;
        }
        return EMPTY_STRING;
    }
}
