package com.kata.tictactoe;

enum Position {
    ONE(0,0);

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

    public Position getPosition(int position) {
        if (position == 1) {
            return Position.ONE;
        }
        return null;
    }
}
