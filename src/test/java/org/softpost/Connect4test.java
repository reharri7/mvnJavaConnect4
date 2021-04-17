package org.softpost;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class Connect4test {
    private String [][] emptyArray = new String[6][7];
    private String[][] horizontalWin = {
        {null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null},
        {"X","X","X","X", null, null, null}
    };
    private String[][] verticalWin = 
    {
        {"X"},
        {"X"},
        {"X"},
        {"X"},
        {null},
        {null}
    };

    private String[][] diagonalWin = {
        {null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null},
        {null, null, null, "X", null, null, null},
        {null, null, "X", null, null, null, null},
        {null, "X", null, null, null, null, null},
        {"X", null, null, null, null, null, null}
    };
    

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
        
    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {

    }
    @Test
    public final void testInputValid(){
        assertFalse(connect4.inputValid(0, emptyArray));
        assert(connect4.inputValid(1, emptyArray));
        assert(connect4.inputValid(7, emptyArray));
        assertFalse(connect4.inputValid(8, emptyArray));
        assertFalse(connect4.inputValid(-10, emptyArray));

    }

    @Test
    public final void testCheckHorizontal() {
        assertFalse(connect4.checkHorizontal(emptyArray, "XXXX"));
        assert(connect4.checkHorizontal(horizontalWin, "XXXX"));
        assertFalse(connect4.checkHorizontal(verticalWin, "XXXX"));
    }

    @Test
    public final void testCheckVertical() {
        assertFalse(connect4.checkVertical(emptyArray, "XXXX"));
        assert(connect4.checkVertical(verticalWin, "XXXX"));
        assertFalse(connect4.checkVertical(horizontalWin, "XXXX"));
    }

    @Test
    public final void testDiagonalWin(){
        assertFalse(connect4.checkDiagonal(emptyArray, "XXXX"));
        assert(connect4.checkDiagonal(diagonalWin, "XXXX"));
        assertFalse(connect4.checkDiagonal(horizontalWin, "XXXX"));

    }

//    @Test
//    public final void testTurnClass(){
//        Turn t1 = new Turn();
//        t1.getCount();
//        assert(t1.getCount() == 0);
//        t1.incrementCount();
//        assert(t1.getCount() == 1);
//    }

    //@Test
//    public final void testColumnClass(){
//        Column c1 = new Column();
//        c1.setWait(true);
//        c1.setValue(1);
//        assert(c1.getwait());
//        assert(c1.getValue() == 1);
//    }

    @Test
    public final void testComputerMove(){
        assert(connect4ComputerPlayer.getComputerMove() > 0 || connect4ComputerPlayer.getComputerMove() < 8);
    }
    
    @Test
    public final void testComputerPlayer() {
    	connect4ComputerPlayer c1 = new connect4ComputerPlayer();
    	c1.runHumanVsComputer();
    	assert(c1.getComputerMove() > 0 || c1.getComputerMove() < 8);
    }
    @Test
    public final void testHumanPlayer() {
    	humanVsHuman h1 = new humanVsHuman();
    	h1.runHumanVsHuman();
    }
    

}
