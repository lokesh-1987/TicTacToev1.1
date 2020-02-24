package com.kata.tictactoe;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TicTacToeBoardTest {

    private TicTacToeBoard ticTacToeBoard;

    @Before
    public void setUp() {
        ticTacToeBoard = new TicTacToeBoard();
    }

    @Test
    public void ticTacToeBoardShouldReturnRowLengthOf5AfterInitialization() {
        assertThat(ticTacToeBoard.board.length, is(5));
    }

    @Test
    public void ticTacToeBoardShouldReturnColumnLengthOf5AfterInitialization() {
        assertThat(ticTacToeBoard.board[0].length, is(5));
    }
}
