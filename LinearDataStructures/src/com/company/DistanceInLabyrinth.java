package com.company;

import javafx.scene.control.Cell;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class DistanceInLabyrinth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        String[][] lab = new String[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                lab[i][j] = in.nextLine();
            }
            
        }

        boolean[][] visited = new boolean[lab.length][lab.length];

        int row = 1;
        int col = 0;

//        Queue<Cell> queue = new ArrayDeque<>();
//        queue.add(new Cell(row,col,true,0));

       



    }

     class Cell{

        public Cell(int row, int col, boolean visited, int movies ){

            this.Row = row;
            this.Col = col;
            this.Visited = visited;
            this.Moves = movies;

        }

        public int Row;
        public int Col;

        public boolean Visited;
        public int Moves;

        public int getRow() {
            return Row;
        }

        public void setRow(int row) {
            Row = row;
        }

        public boolean isVisited() {
            return Visited;
        }

        public void setVisited(boolean visited) {
            Visited = visited;
        }

        public int getCol() {
            return Col;
        }

        public void setCol(int col) {
            Col = col;
        }



        public int getMoves() {
            return Moves;
        }

        public void setMoves(int moves) {
            Moves = moves;
        }


    }
}
