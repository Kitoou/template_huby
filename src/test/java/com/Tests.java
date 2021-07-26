package com;


import com.example.blockdoku.Board;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.lang.String;
import java.util.logging.Logger;

public class Tests {
    @Test
    public void test1(){
        Board board = Board.getTable();
        board.printBoard();
    }

}
