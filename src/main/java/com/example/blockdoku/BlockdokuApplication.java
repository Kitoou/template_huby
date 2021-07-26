package com.example.blockdoku;



public class BlockdokuApplication {

    public static void main(String[] args) { // main for test
        var board = Board.getTable();
        board.insertPiece(Board.Piece.DOWN_L , 0 , 2);

        board.printBoard();

    }
}
