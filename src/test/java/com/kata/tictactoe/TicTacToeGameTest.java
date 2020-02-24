package com.kata.tictactoe;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TicTacToeGameTest {

    private static final String EMPTY_STRING = "";
    private TicTacToeGame ticTacToeGame;

    @Before
    public void setUp() {
        ticTacToeGame = new TicTacToeGame();
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
        assertThat(ticTacToeGame.playGame(4,4,'X'), is("Game is Draw!"));
    }
}
