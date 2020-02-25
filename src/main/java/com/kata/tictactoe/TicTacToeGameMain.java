package com.kata.tictactoe;

import java.util.Scanner;

public class TicTacToeGameMain {

    private static final String POSITION_IS_INVALID = "Position is Invalid!";
    private static final String EMPTY_STRING = "";

    public static void main(String[] args) {
        TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();
        TicTacToeGame ticTacToeGame = new TicTacToeGame(ticTacToeBoard);

        Player player = Player.X;
        Position position = Position.ONE;

        ticTacToeBoard.setUpBoard();
        ticTacToeBoard.displayBoard();
        while(true) {
            int pos = getPlayerPosition(player.name());
            Position positionValue = position.getPosition(pos);
            int row = positionValue.getRow();
            int col = positionValue.getColumn();

            String message = ticTacToeGame.playGame(row, col, player.getPlayerSymbol());

            if (message.equals(EMPTY_STRING)) {
                ticTacToeBoard.displayBoard();
                System.out.println(message);
                player = player.switchPlayer(player.getPlayerSymbol());
                continue;
            } else if (message.equals(POSITION_IS_INVALID)) {
                ticTacToeBoard.displayBoard();
                System.out.println(message);
                continue;
            }
            ticTacToeBoard.displayBoard();
            System.out.println(message);
            break;
        }
    }

    private static int getPlayerPosition(String playerName) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Player " + playerName+": Enter your placement (1 to 9) ::");
        int pos = scanner.nextInt();
        System.out.println(pos);
        return pos;
    }
}
