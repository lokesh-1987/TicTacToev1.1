package com.kata.tictactoe;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TicTacToeBoardTest {

    private static final int FIVE = 5;
    private TicTacToeBoard ticTacToeBoard;
    private char[][] board = {{' ','|',' ','|',' '},
            {'-','+','-','+','-'},
            {' ','|',' ','|',' '},
            {'-','+','-','+','-'},
            {' ','|',' ','|',' '}};

    @Before
    public void setUp() {
        ticTacToeBoard = new TicTacToeBoard();
    }

    @Test
    public void ticTacToeBoardShouldReturnRowLengthOf5AfterInitialization() {
        assertThat(ticTacToeBoard.board.length, is(FIVE));
    }

    @Test
    public void ticTacToeBoardShouldReturnColumnLengthOf5AfterInitialization() {
        assertThat(ticTacToeBoard.board[0].length, is(FIVE));
    }

    @Test
    public void ticTacToeBoardShouldReturnValidBoardOnceSetUp() {
        ticTacToeBoard.setUpBoard();
        assertArrayEquals(ticTacToeBoard.board, this.board);
    }

    @Test
    public void ticTacToeBoardShouldSetValeAsXAtIndex_2_2() {
        ticTacToeBoard.setValue(2,2,'X');
        assertThat(ticTacToeBoard.board[2][2], is('X'));
    }

    @Test
    public void ticTacToeBoardShouldSetValeAsOAndGetSameValueAtIndex_2_0() {
        ticTacToeBoard.setValue(2,0,'0');
        assertThat(ticTacToeBoard.getValue(2, 0), is('0'));
    }

    @Test
    public void ticTacToeBoardShouldTrueOnceValueXIsOccupiedAtIndex_2_4(){
        ticTacToeBoard.setValue(2,4,'X');
        assertTrue(ticTacToeBoard.isPositionOccupied(2, 4));
    }

    @Test
    public void ticTacToeBoardShouldTrueOnceValueOIsOccupiedAtIndex_2_4(){
        ticTacToeBoard.setValue(2,4,'0');
        assertTrue(ticTacToeBoard.isPositionOccupied(2, 4));
    }

    @Test
    public void ticTacToeBoarShouldReturnTrueIfRowIsGreaterThan4OutOfBoardDimension() {
        assertTrue(ticTacToeBoard.isRowOutOfBoardDimension(6));
    }

    @Test
    public void ticTacToeBoarShouldReturnTrueIfRowIsLessThan0OutOfBoardDimension() {
        assertTrue(ticTacToeBoard.isRowOutOfBoardDimension(-1));
    }

    @Test
    public void ticTacToeBoarShouldReturnTrueIfColIsLessThan0OutOfBoardDimension() {
        assertTrue(ticTacToeBoard.isColOutOfBoardDimension(-1));
    }

    @Test
    public void ticTacToeBoarShouldReturnTrueIfColIsGreaterThan4OutOfBoardDimension() {
        assertTrue(ticTacToeBoard.isColOutOfBoardDimension(5));
    }

    @Test
    public void ticTacToeBoarShouldReturnTrueForInvalidPositions() {
        assertTrue(ticTacToeBoard.isInvalidPosition(2, 6));
    }

    @Test
    public void ticTacToeBoardShouldReturnTrueIfFirstRowIsFullOfO() {
        ticTacToeBoard.setValue(0,0,'0');
        ticTacToeBoard.setValue(0,2,'0');
        ticTacToeBoard.setValue(0,4,'0');
        assertTrue(ticTacToeBoard.isFirstRowFullOfEitherXOr0('0'));
    }

    @Test
    public void ticTacToeBoardShouldReturnFalseIfFirstRowIsNotFullOfX() {
        ticTacToeBoard.setValue(0,0,'X');
        ticTacToeBoard.setValue(0,2,'0');
        ticTacToeBoard.setValue(0,4,'X');
        assertFalse(ticTacToeBoard.isFirstRowFullOfEitherXOr0('X'));
    }

    @Test
    public void ticTacToeBoardShouldReturnTrueIfSecondRowIsFullOfX() {
        ticTacToeBoard.setValue(2,0,'X');
        ticTacToeBoard.setValue(2,2,'X');
        ticTacToeBoard.setValue(2,4,'X');
        assertTrue(ticTacToeBoard.isSecondRowFullOfEitherXOr0('X'));
    }

    @Test
    public void ticTacToeBoardShouldReturnTrueIfSecondRowIsFullOf0() {
        ticTacToeBoard.setValue(2,0,'0');
        ticTacToeBoard.setValue(2,2,'0');
        ticTacToeBoard.setValue(2,4,'0');
        assertTrue(ticTacToeBoard.isSecondRowFullOfEitherXOr0('0'));
    }

    @Test
    public void ticTacToeBoardShouldReturnFalseIfSecondRowIsNotFullX() {
        ticTacToeBoard.setValue(2,0,'X');
        ticTacToeBoard.setValue(2,2,'0');
        ticTacToeBoard.setValue(2,4,'X');
        assertFalse(ticTacToeBoard.isSecondRowFullOfEitherXOr0('X'));
    }

    @Test
    public void ticTacToeBoardShouldReturnTrueIfLastRowIsFullOfX() {
        ticTacToeBoard.setValue(4,0,'X');
        ticTacToeBoard.setValue(4,2,'X');
        ticTacToeBoard.setValue(4,4,'X');
        assertTrue(ticTacToeBoard.isLastRowFullOfEitherXOr0('X'));
    }

    @Test
    public void ticTacToeBoardShouldReturnTrueIfLastRowIsFullOf0() {
        ticTacToeBoard.setValue(4,0,'0');
        ticTacToeBoard.setValue(4,2,'0');
        ticTacToeBoard.setValue(4,4,'0');
        assertTrue(ticTacToeBoard.isLastRowFullOfEitherXOr0('0'));
    }

    @Test
    public void ticTacToeBoardShouldReturnFalseIfLastRowIsNotFullOfX() {
        ticTacToeBoard.setValue(4,0,'X');
        ticTacToeBoard.setValue(4,2,'0');
        ticTacToeBoard.setValue(4,4,'X');
        assertFalse(ticTacToeBoard.isSecondRowFullOfEitherXOr0('X'));
    }

    @Test
    public void ticTacToeBoardShouldReturnTrueIfEitherOfRowIsFullOfX() {
        ticTacToeBoard.setValue(4,0,'X');
        ticTacToeBoard.setValue(4,2,'X');
        ticTacToeBoard.setValue(4,4,'X');
        assertTrue(ticTacToeBoard.isEitherOfRowFullOfEitherXOr0('X'));
    }

    @Test
    public void ticTacToeBoardShouldReturnTrueIfFirstColIsFullOfO() {
        ticTacToeBoard.setValue(0,0,'0');
        ticTacToeBoard.setValue(2,0,'0');
        ticTacToeBoard.setValue(4,0,'0');
        assertTrue(ticTacToeBoard.isFirstColFullOfEitherXOr0('0'));
    }

    @Test
    public void ticTacToeBoardShouldReturnTrueIfFirstColIsFullOfX() {
        ticTacToeBoard.setValue(0,0,'X');
        ticTacToeBoard.setValue(2,0,'X');
        ticTacToeBoard.setValue(4,0,'X');
        assertTrue(ticTacToeBoard.isFirstColFullOfEitherXOr0('X'));
    }

    @Test
    public void ticTacToeBoardShouldReturnFalseIfFirstColIsNotFullOfX() {
        ticTacToeBoard.setValue(0,0,'X');
        ticTacToeBoard.setValue(4,0,'X');
        assertFalse(ticTacToeBoard.isFirstColFullOfEitherXOr0('X'));
    }

    @Test
    public void ticTacToeBoardShouldReturnTrueIfSecondColIsFullOfO() {
        ticTacToeBoard.setValue(0,2,'0');
        ticTacToeBoard.setValue(2,2,'0');
        ticTacToeBoard.setValue(4,2,'0');
        assertTrue(ticTacToeBoard.isSecondColFullOfEitherXOr0('0'));
    }

    @Test
    public void ticTacToeBoardShouldReturnTrueIfSecondColIsFullOfX() {
        ticTacToeBoard.setValue(0,2,'X');
        ticTacToeBoard.setValue(2,2,'X');
        ticTacToeBoard.setValue(4,2,'X');
        assertTrue(ticTacToeBoard.isSecondColFullOfEitherXOr0('X'));
    }

    @Test
    public void ticTacToeBoardShouldReturnFalseIfSecondColIsNotFullOfX() {
        ticTacToeBoard.setValue(0,2,'0');
        ticTacToeBoard.setValue(2,2,'X');
        ticTacToeBoard.setValue(4,2,'X');
        assertFalse(ticTacToeBoard.isSecondColFullOfEitherXOr0('X'));
    }

    @Test
    public void ticTacToeBoardShouldReturnTrueIfLastColIsFullOfO() {
        ticTacToeBoard.setValue(0,4,'0');
        ticTacToeBoard.setValue(2,4,'0');
        ticTacToeBoard.setValue(4,4,'0');
        assertTrue(ticTacToeBoard.isLastColFullOfEitherXOr0('0'));
    }

    @Test
    public void ticTacToeBoardShouldReturnTrueIfLastColIsFullOfX() {
        ticTacToeBoard.setValue(0,4,'X');
        ticTacToeBoard.setValue(2,4,'X');
        ticTacToeBoard.setValue(4,4,'X');
        assertTrue(ticTacToeBoard.isLastColFullOfEitherXOr0('X'));
    }

    @Test
    public void ticTacToeBoardShouldReturnFalseIfLastColIsNotFullOfX() {
        ticTacToeBoard.setValue(0,4,'X');
        ticTacToeBoard.setValue(2,4,'X');
        assertFalse(ticTacToeBoard.isLastColFullOfEitherXOr0('X'));
    }

    @Test
    public void ticTacToeBoardShouldReturnTrueIfEitherOfColIsFullOfX() {
        ticTacToeBoard.setValue(0,4,'X');
        ticTacToeBoard.setValue(2,4,'X');
        ticTacToeBoard.setValue(4,4,'X');
        assertTrue(ticTacToeBoard.isEitherOfColFullOfEitherXOr0('X'));
    }

    @Test
    public void ticTacToeBoardShouldReturnTrueIfFirstDiagonalIsFullOfO() {
        ticTacToeBoard.setValue(0,4,'0');
        ticTacToeBoard.setValue(2,2,'0');
        ticTacToeBoard.setValue(4,0,'0');
        assertTrue(ticTacToeBoard.isFirstDiagonalFullOfEitherXOr0('0'));
    }

    @Test
    public void ticTacToeBoardShouldReturnFalseIfFirstDiagonalIsNotFullOfO() {
        ticTacToeBoard.setValue(0,4,'X');
        ticTacToeBoard.setValue(2,2,'0');
        ticTacToeBoard.setValue(4,0,'0');
        assertFalse(ticTacToeBoard.isFirstDiagonalFullOfEitherXOr0('0'));
    }

    @Test
    public void ticTacToeBoardShouldReturnTrueIfSecondDiagonalIsFullOfX() {
        ticTacToeBoard.setValue(0,0,'X');
        ticTacToeBoard.setValue(2,2,'X');
        ticTacToeBoard.setValue(4,4,'X');
        assertTrue(ticTacToeBoard.isSecondDiagonalFullOfEitherXOr0('X'));
    }

    @Test
    public void ticTacToeBoardShouldReturnFalseIfSecondDiagonalIsNotFullOfX() {
        ticTacToeBoard.setValue(0,0,'X');
        ticTacToeBoard.setValue(4,4,'X');
        assertFalse(ticTacToeBoard.isSecondDiagonalFullOfEitherXOr0('X'));
    }

    @Test
    public void ticTacToeBoardShouldReturnTrueIfEitherOfDiagonalIsFullOfX() {
        ticTacToeBoard.setValue(0,0,'X');
        ticTacToeBoard.setValue(2,2,'X');
        ticTacToeBoard.setValue(4,4,'X');
        assertTrue(ticTacToeBoard.isEitherOfDiagonalFullOfEitherXOr0('X'));
    }

    @Test
    public void ticTacToeBoardShouldReturnTrueIfFull() {
        ticTacToeBoard.setValue(0,0,'0');
        ticTacToeBoard.setValue(0,2,'0');
        ticTacToeBoard.setValue(0,4,'0');
        ticTacToeBoard.setValue(2,0,'0');
        ticTacToeBoard.setValue(2,2,'0');
        ticTacToeBoard.setValue(2,4,'0');
        ticTacToeBoard.setValue(4,0,'0');
        ticTacToeBoard.setValue(4,2,'0');
        ticTacToeBoard.setValue(4,4,'0');
        assertTrue(ticTacToeBoard.isBoardFull());
    }

    @Test
    public void ticTacToeBoardShouldBeDisplayedInitiallyBeforeGameStarts() {
        ticTacToeBoard.setUpBoard();
        ticTacToeBoard.displayBoard();
    }
}
