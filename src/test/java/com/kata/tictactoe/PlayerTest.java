package com.kata.tictactoe;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PlayerTest {

    @Test
    public void playerSymbolIsXIfInitializedWithX() {
        Player player = Player.X;
        assertThat(player.getPlayerSymbol(), is('X'));
    }

    @Test
    public void playerSymbolIsOIfInitializedWithO() {
        Player player = Player.O;
        assertThat(player.getPlayerSymbol(), is('0'));
    }
}
