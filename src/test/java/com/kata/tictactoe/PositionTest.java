package com.kata.tictactoe;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PositionTest {
    @Test
    public void positionReturnsRowAs0IfInitializedWithONE() {
        Position position = Position.ONE;
        assertThat(position.getRow(), is(0));
    }
}
