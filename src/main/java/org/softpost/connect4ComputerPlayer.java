package org.softpost;


import java.util.Random;



public class connect4ComputerPlayer {
    public static void runHumanVsComputer() {
        String[][] gameArray = new String[6][7];
        //connect4TextConsole.printGameBoard(gameArray);
        int turnCount = 0;
        boolean gameOver = false;

        while(!gameOver) {
            if( turnCount % 2 == 0){
                String checkAgainst = "XXXX";
                int column = getComputerMove();

                if(connect4.inputValid(column, gameArray)){
                    for( int i = 0; i < 5; i++){
                        if(gameArray[i+1][column - 1] != null){
                            gameArray[i][column - 1] = "X";
                            break;
                        }
                    }
                    if(gameArray[5][column - 1] == null) {
                        gameArray[5][column - 1] = "X";
                    }
                    //connect4TextConsole.printGameBoard(gameArray);
                    turnCount++;
                }
                else {
                    //connect4TextConsole.printGameBoard(gameArray);
                    //connect4TextConsole.cannotPlace("X");
                }
                //check if win for Player X
                if(connect4.checkHorizontal(gameArray, checkAgainst) || connect4.checkVertical(gameArray, checkAgainst) || connect4.checkDiagonal(gameArray, checkAgainst)){
                    //connect4TextConsole.playerWin("X");
                    gameOver = true;
                }
            }
            else {
                //This line makes sure there is still an empty space.
                //Turns only count if a valid move is made
                if( turnCount % 41 == 0){
                    //connect4TextConsole.tieGame();
                    gameOver = true;
                }
                int column = getComputerMove();
                String checkAgainst = "OOOO";

                if(connect4.inputValid(column, gameArray)){
                    for( int i = 0; i < 5; i++){
                        if(gameArray[i+1][column - 1] != null){
                            gameArray[i][column - 1] = "O";
                            break;
                        }
                    }
                    if(gameArray[5][column - 1] == null) {
                        gameArray[5][column - 1] = "O";
                    }
                    //connect4TextConsole.printGameBoard(gameArray);
                    turnCount++;
                } else{
                    // Don't do anything. The loop will continue and
                    // come back so the computer can try a move again
                    // if the column chosen is taken.
                }
                if(connect4.checkHorizontal(gameArray, checkAgainst) || connect4.checkVertical(gameArray, checkAgainst) || connect4.checkDiagonal(gameArray, checkAgainst)){
                    //connect4TextConsole.playerWin("O");
                    gameOver = true;
                }
            }
        }
    }

    public static int getComputerMove() {
        Random rand = new Random();
        int random = rand.nextInt(7);
        random++;
        return random;
    }
}
