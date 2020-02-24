package com.kata.tictactoe;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

public class PlayerTest {

    @Test
    public void playerSymbolIsXIfInitializedWithX() {
        Player player = Player.X;
        Assert.assertThat(player.getPlayerSymbol(), Is.is('X'));
    }
}
