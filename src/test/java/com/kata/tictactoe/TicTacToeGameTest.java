package com.kata.tictactoe;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

public class TicTacToeGameTest {

    @Test
    public void ticTacToeGameShouldReturn_EmptyString_IfPlayer_X_MovesOn_0_0_Position() {
        TicTacToeGame ticTacToeGame = new TicTacToeGame();
        Assert.assertThat(ticTacToeGame.playGame(0,0,'X'), Is.is(""));
    }
}
