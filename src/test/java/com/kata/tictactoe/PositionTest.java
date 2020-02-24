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

    @Test
    public void positionReturnsColumnAs0IfInitializedWithONE() {
        Position position = Position.ONE;
        assertThat(position.getColumn(), is(0));
    }

    @Test
    public void positionReturnsONEIfInitializedWith1() {
        Position position = Position.ONE;
        Position pos = position.getPosition(1);
        assertThat(pos.name(), is(Position.ONE.name()));
    }
}
