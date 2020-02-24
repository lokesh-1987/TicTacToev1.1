package com.kata.tictactoe;

enum Position {
    ONE(0,0), TWO(0,2);

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
        }
        return null;
    }
}
