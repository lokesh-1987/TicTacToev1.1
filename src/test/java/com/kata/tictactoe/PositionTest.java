package com.kata.tictactoe;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PositionTest {

    Position position = Position.ONE;

    @Test
    public void positionReturnsRowAs0IfInitializedWithONE() {
        assertThat(position.getRow(), is(0));
    }

    @Test
    public void positionReturnsColumnAs0IfInitializedWithONE() {
        assertThat(position.getColumn(), is(0));
    }

    @Test
    public void positionReturnsONEIfInitializedWith1() {
        Position pos = position.getPosition(1);
        assertThat(pos.name(), is(Position.ONE.name()));
    }
}
