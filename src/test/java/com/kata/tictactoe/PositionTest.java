package com.kata.tictactoe;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

public class PositionTest {
    @Test
    public void positionReturnsRowAs0IfInitializedWithONE() {
        Position position = Position.ONE;
        Assert.assertThat(position.getRow(), Is.is(0));
    }
}
