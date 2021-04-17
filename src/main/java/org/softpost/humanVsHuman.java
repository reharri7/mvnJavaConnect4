package org.softpost;


public class humanVsHuman {
    public static void runHumanVsHuman() {
        String[][] gameArray = new String [6][7];
        //connect4TextConsole.printGameBoard(gameArray);
        int turnCount = 0;
        boolean gameOver = false;


        while(!gameOver) {
            if( turnCount % 2 == 0 ) {
                String checkAgainst = "XXXX";
                int column = connect4ComputerPlayer.getComputerMove();
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
                else{
                    //connect4TextConsole.printGameBoard(gameArray);
                    //connect4TextConsole.cannotPlace("X");
                }
                //check if win for Player X
                if(connect4.checkHorizontal(gameArray, checkAgainst) || connect4.checkVertical(gameArray, checkAgainst) || connect4.checkDiagonal(gameArray, checkAgainst)){
                    //connect4TextConsole.playerWin("X");
                    gameOver = true;
                }
            } else {
                //This checks to see if there are empty spaces on the board
                if( turnCount % 41 == 0){
                    //connect4TextConsole.tieGame();
                    gameOver = true;
                }

                int column = connect4ComputerPlayer.getComputerMove();
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
                }
                else{
                    //connect4TextConsole.printGameBoard(gameArray);
                    //connect4TextConsole.cannotPlace("O");
                }
                //check if win for player O
                if(connect4.checkHorizontal(gameArray, checkAgainst) || connect4.checkVertical(gameArray, checkAgainst) || connect4.checkDiagonal(gameArray, checkAgainst)){
                    //connect4TextConsole.playerWin("O");
                    gameOver = true;
                }
            }
        }


    }
}

