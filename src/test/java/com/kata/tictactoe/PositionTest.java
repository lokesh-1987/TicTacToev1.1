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

    @Test
    public void positionReturnsTWOIfInitializedWith2() {
        Position pos = position.getPosition(2);
        assertThat(pos.name(), is(Position.TWO.name()));
    }

    @Test
    public void positionReturnsTHREEIfInitializedWith3() {
        Position pos = position.getPosition(3);
        assertThat(pos.name(), is(Position.THREE.name()));
    }

    @Test
    public void positionReturnsFOURIfInitializedWith4() {
        Position pos = position.getPosition(4);
        assertThat(pos.name(), is(Position.FOUR.name()));
    }
}
