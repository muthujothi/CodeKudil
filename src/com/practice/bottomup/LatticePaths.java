package com.practice.bottomup;

import edu.princeton.cs.algs4.StdOut;

//Project Euler - Problem 015
public class LatticePaths {

    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);

        //Create a Grid of Size (N+1)(N+1).
        //Index will range from 0 to N.
        long[][] grid = new long[n+1][n+1];

        //Last row and Last Column except the last cell will be 1.
        //Because there is only route in right (-->) and down direction.
        for(int i = 0; i < n; i++)
            grid[n][i] = 1;
        for(int i = 0; i < n; i++)
            grid[i][n] = 1;

        //Bottom-Up Construction.
        //1. Start from row = (n-1) and column = (n-1) and compute the number of paths from each cell to the
        //target call as, grid[n-1][n-1] = grid[n-1][n] (right cell) + grid[n][n-1] (down cell)
        //2. This way, finally the computed value of cell grid[0][0] will tell how many paths exists from start to end.

        for(int row = (n-1); row >= 0; row--)
            for(int col = (n-1); col >= 0; col--){
                grid[row][col] = grid[row][col+1] + grid[row+1][col];
            }

        StdOut.println("Number of Paths " + grid[0][0]);

    }
}
