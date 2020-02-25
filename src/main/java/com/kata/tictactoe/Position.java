package com.kata.tictactoe;

enum Position {
    ONE(0,0), TWO(0,2), THREE(0,4), FOUR(2,0), FIVE(2,2), SIX(2,4), SEVEN(4,0), EIGHT(4,2), NINE(4,4), INVALID(-1,-1);

    private final int row;
    private final int column;

    Position(int row, int column) {
        this.row = row;
        this.column = column;
    }

    int getRow() {
        return this.row;
    }

    int getColumn() {
        return this.column;
    }

    Position getPosition(int position) {
        if (position == 1) {
            return Position.ONE;
        } else if (position == 2) {
            return Position.TWO;
        } else if (position == 3) {
            return Position.THREE;
        } else if (position == 4) {
            return Position.FOUR;
        } else if (position == 5) {
            return Position.FIVE;
        } else if (position == 6) {
            return Position.SIX;
        } else if (position == 7) {
            return Position.SEVEN;
        } else if (position == 8) {
            return Position.EIGHT;
        } else if (position == 9) {
            return Position.NINE;
        }
        return Position.INVALID;
    }
}
