package com.kata.tictactoe;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TicTacToeBoardTest {

    @Test
    public void ticTacToeBoardShouldReturnRowLengthOf5AfterInitialization() {
        TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();
        assertThat(ticTacToeBoard.board.length, is(5));
    }

    @Test
    public void ticTacToeBoardShouldReturnColumnLengthOf5AfterInitialization() {
        TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();
        assertThat(ticTacToeBoard.board[0].length, is(5));
    }
}
