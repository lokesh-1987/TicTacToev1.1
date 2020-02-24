package com.kata.tictactoe;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TicTacToeGameTest {

    private static final String EMPTY_STRING = "";
    private static final String GAME_IS_DRAW = "Game is Draw!";
    private static final String POSITION_IS_INVALID = "Position is Invalid!";
    private static final String PLAYER_X_WON = "Player X Won!";
    private TicTacToeGame ticTacToeGame;
    private TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();

    @Before
    public void setUp() {
        ticTacToeGame = new TicTacToeGame(ticTacToeBoard);
    }

    @Test
    public void ticTacToeGameShouldReturn_EmptyString_IfPlayer_X_MovesOn_0_0_Position() {
        assertThat(ticTacToeGame.playGame(0,0,'X'), is(EMPTY_STRING));
    }

    @Test
    public void ticTacToeGameShouldReturn_EmptyString_IfPlayerXGoes1stAt_0_0_And_Player_O_Goes2ndAt_0_2_Position() {
        assertThat(ticTacToeGame.playGame(0,0,'X'), is(EMPTY_STRING));
        assertThat(ticTacToeGame.playGame(0,2,'0'), is(EMPTY_STRING));
    }

    @Test
    public void ticTacToeGameShouldReturn_GameIsDrawMessage_ifThePlayersMoveAlternativelyUntilGameIsDraw() {
        assertThat(ticTacToeGame.playGame(0,0,'X'), is(EMPTY_STRING));
        assertThat(ticTacToeGame.playGame(0,2,'0'), is(EMPTY_STRING));
        assertThat(ticTacToeGame.playGame(0,4,'X'), is(EMPTY_STRING));
        assertThat(ticTacToeGame.playGame(2,0,'0'), is(EMPTY_STRING));
        assertThat(ticTacToeGame.playGame(2,2,'X'), is(EMPTY_STRING));
        assertThat(ticTacToeGame.playGame(2,4,'0'), is(EMPTY_STRING));
        assertThat(ticTacToeGame.playGame(4,2,'X'), is(EMPTY_STRING));
        assertThat(ticTacToeGame.playGame(4,0,'0'), is(EMPTY_STRING));
        assertThat(ticTacToeGame.playGame(4,4,'X'), is(GAME_IS_DRAW));
    }

    @Test
    public void ticTacToeGameShouldReturn_InvalidPositionMessage_IfEitherPlayerPlaysOnOccupiedPosition() {
        assertThat(ticTacToeGame.playGame(0,2,'X'), is(EMPTY_STRING));
        assertThat(ticTacToeGame.playGame(0,2,'0'), is(POSITION_IS_INVALID));
    }

    @Test
    public void ticTacToeGameShouldReturn_InvalidPositionMessage_IfRowIsGreaterThan4OutOfBoardDimension() {
        assertThat(ticTacToeGame.playGame(6,2,'0'), is(POSITION_IS_INVALID));
    }

    @Test
    public void ticTacToeGameShouldReturn_InvalidPositionMessage_IfColIsGreaterThan4OutOfBoardDimension() {
        assertThat(ticTacToeGame.playGame(2,8,'0'), is(POSITION_IS_INVALID));
    }

    @Test
    public void ticTacToeGameShouldReturn_WinningMessage_IfPlayerXCompletesFirstRow() {
        assertThat(ticTacToeGame.playGame(0,0,'X'), is(EMPTY_STRING));
        assertThat(ticTacToeGame.playGame(2,2,'0'), is(EMPTY_STRING));
        assertThat(ticTacToeGame.playGame(0,4,'X'), is(EMPTY_STRING));
        assertThat(ticTacToeGame.playGame(2,0,'0'), is(EMPTY_STRING));
        assertThat(ticTacToeGame.playGame(0,2,'X'), is(PLAYER_X_WON));
    }
}
