package com.practice.bottomup;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class MaxSumPathI {

    public static void computeMaxPathSum(int[][] grid){

        int n = grid.length - 1; //No.of Rows in the grid based on the index.

        //Starting from the (bottom-1) row, for each compute the max path based on the below two
        //option neighbours. The logic is such that whenever u reach a particular cell, the max sum is
        //obtained by travelling to the right or to the left.
        int cnt_elems = n;
        for(int i = n-1; i >= 0; i--){
            for(int j = 0; j < cnt_elems; j++){
                grid[i][j] = Math.max(grid[i][j]+grid[i+1][j], grid[i][j]+grid[i+1][j+1]);
            }
            cnt_elems--;
        }

        StdOut.println("Max Path Sum Obtainable is " + grid[0][0]);
    }

    public static void main(String[] args) {

        //No.Of Rows in the Triangle.
        int N = Integer.parseInt(args[0]);
        int[][] grid = new int[N][N];

        int row = 0;
        while(!StdIn.isEmpty()){
            String[] line = StdIn.readLine().split(" ");
            for(int col = 0; col < line.length; col++)
                grid[row][col] = Integer.valueOf(line[col]);
            row++;
        }

        /*StdOut.println("Grid Populated.");
        for(int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++)
                StdOut.print(grid[i][j] + " ");
            StdOut.println();
        }*/

        computeMaxPathSum(grid);
    }
}
