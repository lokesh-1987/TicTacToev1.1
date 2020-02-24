package com.kata.tictactoe;

class TicTacToeGame {

    private static final String EMPTY_STRING = "";
    private static final String GAME_IS_DRAW = "Game is Draw!";
    private static final String POSITION_IS_INVALID = "Position is Invalid!";
    private static final String PLAYER = "Player ";
    private static final String WON = " Won!";
    private TicTacToeBoard ticTacToeBoard;

    TicTacToeGame(TicTacToeBoard ticTacToeBoard) {
        this.ticTacToeBoard = ticTacToeBoard;
    }

    String playGame(int row, int col, char value) {
        if (ticTacToeBoard.isInvalidPosition(row,col)) {
            return POSITION_IS_INVALID;
        }
        ticTacToeBoard.setValue(row,col,value);
        if (ticTacToeBoard.isBoardFull()) {
            return GAME_IS_DRAW;
        } else if (ticTacToeBoard.isEitherOfRowFullOfEitherXOr0(value)) {
            return PLAYER +value+ WON;
        } else if (ticTacToeBoard.isFirstColFullOfEitherXOr0(value)) {
            return PLAYER +value+ WON;
        } else if (ticTacToeBoard.isSecondColFullOfEitherXOr0(value)) {
            return PLAYER +value+ WON;
        }
        return EMPTY_STRING;
    }
}
