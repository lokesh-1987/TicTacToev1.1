# Tic Tac Toe

![Alt text](images/Kata_TicTacToe.png?raw=true "Tic Tac Toe")

## About this Kata

This short and simple Kata should be performed using **Test Driven Development** (TDD).

## Rules

The rules are described below :

- X always goes first.
- Players cannot play on a played position.
- Players alternate placing X’s and O’s on the board until either:
	- One player has three in a row, horizontally, vertically or diagonally
	- All nine squares are filled.
- If a player is able to draw three X’s or three O’s in a row, that player wins.
- If all nine squares are filled and neither player has three in a row, the game is a draw.

## Implementation

    ## Tic Tac Toe Application
        - This Application basically contains a (5*5) board as shown below,

           $(0,0)|$(0,0) |$(0,0)
           (1)   | (2)   |  (3)
           ------+-------+------
           $(0,0)|$(0,0) |$(0,0)
            (4)  |  (5)  | (6)
           ------+-------+------
           $(0,0)|$(0,0) |$(0,0)
             (7) |  (8)  | (9)

        -   Always Player X plays first, then Player O and, then, both players play alternatively until the game finishes.
        -   Each Player enters the valid position for example 1, 2, etc. and respective position is replaced
            by either X or 0 depending on Player X or O.
        -   The following positions are considered as valid,i.e., 1 --> $(0,0), 2-->$(0,2),
            3--> $(0,4), 4--> $(2,0), 5--> $(2,2), 6--> $(2,4),7--> $(4,0), 8--> $(4,2), 9--> $(4,4)
            and rest other position are considered as Invalid Position.
            If the position is already occupied, then also position is invalid.
            If the position is greater than 9 or less than 1, then the position is invalid.
            If the position is invalid, then a message is displayed on console i.e., Position is Invalid!
        -   If all the valid positions are occupied by the players alternatively, then game is draw.
            If the game draws, then the message is displayed as Game is Draw!
        -   Either player wins if
                1) First row/Column is occupied by X or 0
                2) Second row/column is occupied by X or 0
                3) Last row/column is occupied by X or 0
                4) Both diagonals are occupied by X or 0
            If either player wins the game, then the message is displayed as Player X Won! or Player O Won!

## Execution

In order to run the application, follow the below steps,
 a) Open a terminal window
 b) Change directory to TicTacToe maven project. You should be in a directory that contains pom.xml file.
 c) Run the following command:
        ## mvn exec:java -Dexec.mainClass="com.kata.tictactoe.TicTacToeGameMain"