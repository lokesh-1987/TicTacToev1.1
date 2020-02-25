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

    @Test
    public void positionReturnsFIVEIfInitializedWith5() {
        Position pos = position.getPosition(5);
        assertThat(pos.name(), is(Position.FIVE.name()));
    }

    @Test
    public void positionReturnsSIXIfInitializedWith6() {
        Position pos = position.getPosition(6);
        assertThat(pos.name(), is(Position.SIX.name()));
    }

    @Test
    public void positionReturnsSEVENIfInitializedWith7() {
        Position pos = position.getPosition(7);
        assertThat(pos.name(), is(Position.SEVEN.name()));
    }

    @Test
    public void positionReturnsEIGHTIfInitializedWith8() {
        Position pos = position.getPosition(8);
        assertThat(pos.name(), is(Position.EIGHT.name()));
    }

    @Test
    public void positionReturnsNINEIfInitializedWith9() {
        Position pos = position.getPosition(9);
        assertThat(pos.name(), is(Position.NINE.name()));
    }
}
