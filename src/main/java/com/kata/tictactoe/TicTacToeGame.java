package com.kata.tictactoe;

class TicTacToeGame {

    private static final String EMPTY_STRING = "";
    private static final String GAME_IS_DRAW = "Game is Draw!";
    private static final String POSITION_IS_INVALID = "Position is Invalid!";
    private TicTacToeBoard ticTacToeBoard;

    TicTacToeGame(TicTacToeBoard ticTacToeBoard) {
        this.ticTacToeBoard = ticTacToeBoard;
    }

    String playGame(int row, int col, char value) {
        if (ticTacToeBoard.isRowOutOfBoardDimension(row)) {
            return POSITION_IS_INVALID;
        }else if(ticTacToeBoard.isPositionOccupied(row,col)) {
            return POSITION_IS_INVALID;
        }
        ticTacToeBoard.setValue(row,col,value);
        if (ticTacToeBoard.isBoardFull()) {
            return GAME_IS_DRAW;
        }
        return EMPTY_STRING;
    }
}
