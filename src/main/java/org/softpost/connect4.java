package org.softpost;




public class connect4 {
    
    public static void main(String[] args) {
      //  gameMode.decideGameMode();
    
    }
    /**
     * This method takes each input from the user and checks to see if it is a valid move
     * to be placed on the board.
     * @param input
     * @param gameArray
     * @return a boolean value
     */
    public static boolean inputValid(int input, String [][] gameArray){
        if (input > 0 && input < 8 && gameArray[0][input - 1] == null){
            return true;
        }
        return false;
    }
    /**
     * This method converts each row into a StringBuffer object and checks if there is a win
     * inside of the String.
     * @param gameArray
     * @param str
     * @return a boolean value
     */
    public static boolean checkHorizontal(String [][] gameArray, String str){
        for( int i = 5; i >= 0; i--){
            String array[] = gameArray[i];
            String strArray = arrToStr(array).toString();
            if( strArray.contains(str)){
                return true;
            }
        }
        return false;
    }
    /**
     * This method takes a gameArray parameter, the game board, and a string to check against
     * to see if there is a win. It copies each column to a new array which is converted to
     * a String and then checked to see if there is a win.
     * @param gameArray
     * @param str
     * @return a boolean value
     */
    public static boolean checkVertical(String [][] gameArray, String str){
        for( int i = 0; i < 7; i++){
            String [] array = new String[7];
            for( int j = 0; j < 6; j++){
                array[j] = gameArray[j][i];
            }
            String strArray = arrToStr(array).toString();
            if (strArray.contains(str)){
                return true;
            }
        }
        return false;
    }

    /**
     * This method takes in two parameters. The gameArray which is the game board, and
     * A string to check against to see if there is a win diagonally.
     * There are twelve diagonal axis in connect4 that can result in a win. This method
     * builds a StringBuffer object out of those 12 axis and then checks to see if there
     * is a win amongst them.
     * @param gameArray
     * @param str
     * @return a boolean value
     */
    public static boolean checkDiagonal(String [][] gameArray, String str){
        StringBuffer str1 = new StringBuffer();
        str1.append(gameArray[2][0]);
        str1.append(gameArray[3][1]);
        str1.append(gameArray[4][2]);
        str1.append(gameArray[5][3]);
        if(str1.toString().contains(str)){
            return true;
        }
        
        StringBuffer str2 = new StringBuffer();
        str2.append(gameArray[1][0]);
        str2.append(gameArray[2][1]);
        str2.append(gameArray[3][2]);
        str2.append(gameArray[4][3]);
        str2.append(gameArray[5][4]);
        if(str2.toString().contains(str)){
            return true;
        }

        StringBuffer str3 = new StringBuffer();
        str3.append(gameArray[0][0]);
        str3.append(gameArray[1][1]);
        str3.append(gameArray[2][2]);
        str3.append(gameArray[3][3]);
        str3.append(gameArray[4][4]);
        str3.append(gameArray[5][5]);
        if(str3.toString().contains(str)){
            return true;
        }

        StringBuffer str4 = new StringBuffer();
        str4.append(gameArray[0][1]);
        str4.append(gameArray[1][2]);
        str4.append(gameArray[2][3]);
        str4.append(gameArray[3][4]);
        str4.append(gameArray[4][5]);
        str4.append(gameArray[5][6]);
        if(str4.toString().contains(str)){
            return true;
        }

        StringBuffer str5 = new StringBuffer();
        str5.append(gameArray[0][2]);
        str5.append(gameArray[1][3]);
        str5.append(gameArray[2][4]);
        str5.append(gameArray[3][5]);
        str5.append(gameArray[4][6]);
        if(str5.toString().contains(str)){
            return true;
        }

        StringBuffer str6 = new StringBuffer();
        str6.append(gameArray[0][3]);
        str6.append(gameArray[1][4]);
        str6.append(gameArray[2][5]);
        str6.append(gameArray[3][6]);
        if(str6.toString().contains(str)){
            return true;
        }

        StringBuffer str7 = new StringBuffer();
        str7.append(gameArray[3][0]);
        str7.append(gameArray[2][1]);
        str7.append(gameArray[1][2]);
        str7.append(gameArray[0][3]);
        if(str7.toString().contains(str)){
            return true;
        }

        StringBuffer str8 = new StringBuffer();
        str8.append(gameArray[4][0]);
        str8.append(gameArray[3][1]);
        str8.append(gameArray[2][2]);
        str8.append(gameArray[1][3]);
        str8.append(gameArray[0][4]);
        if(str8.toString().contains(str)){
            return true;
        }

        StringBuffer str9 = new StringBuffer();
        str9.append(gameArray[5][0]);
        str9.append(gameArray[4][1]);
        str9.append(gameArray[3][2]);
        str9.append(gameArray[2][3]);
        str9.append(gameArray[1][4]);
        str9.append(gameArray[0][5]);
        if(str9.toString().contains(str)){
            return true;
        }

        StringBuffer str10 = new StringBuffer();
        str10.append(gameArray[5][1]);
        str10.append(gameArray[4][2]);
        str10.append(gameArray[3][3]);
        str10.append(gameArray[2][4]);
        str10.append(gameArray[1][5]);
        str10.append(gameArray[0][6]);
        if(str10.toString().contains(str)){
            return true;
        }

        StringBuffer str11 = new StringBuffer();
        str11.append(gameArray[5][2]);
        str11.append(gameArray[4][3]);
        str11.append(gameArray[3][4]);
        str11.append(gameArray[2][5]);
        str11.append(gameArray[1][6]);
        if(str11.toString().contains(str)){
            return true;
        }

        StringBuffer str12 = new StringBuffer();
        str12.append(gameArray[5][3]);
        str12.append(gameArray[4][4]);
        str12.append(gameArray[3][5]);
        str12.append(gameArray[2][6]);
        if(str12.toString().contains(str)){
            return true;
        }

        return false;
    }

    /**
     * This method takes information from an array and turns it into a StringBuffer
     * object which is then returned.
     */
    private static StringBuffer arrToStr(String [] arr){
        StringBuffer str = new StringBuffer();
        for(int i = 0; i < arr.length; i++){
            str.append(arr[i]);
        }
        //str.substring(0);
        return str;

    }

    
}