package com.practice.conditionalsandloops;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class LargestProductInGrid {

    public static void computeLargestProduct(int[][] grid){
        //Compute the largest product of 4 adjacent numbers in all 8 directions and print out the greatest.

        long all_largest = 0, left_diagonal_prd = 0, down_prd = 0, right_diagonal_prd = 0, right_prd = 0;
        int n = grid.length;
        int lrow = 0; int lcol = 0;

        for(int row = 0; row < n; row++)
            for(int col = 0; col < n; col++){
                if((n-row >= 4) && (col-3 >= 0))
                    left_diagonal_prd = grid[row][col] * grid[row+1][col-1] * grid[row+2][col-2] * grid[row+3][col-3];
                if(row <= (n-4))
                    down_prd = grid[row][col] * grid[row+1][col] * grid[row+2][col] * grid[row+3][col];
                if((n-row >= 4) && (col <= n-4))
                    right_diagonal_prd = grid[row][col] * grid[row+1][col+1] * grid[row+2][col+2] * grid[row+3][col+3];
                if(col <= n-4)
                    right_prd = grid[row][col] * grid[row][col+1] * grid[row][col+2] * grid[row][col+3];

                long curr_largest = Math.max(Math.max(Math.max(left_diagonal_prd, down_prd), right_diagonal_prd), right_prd);
                if(curr_largest > all_largest){
                    lrow = row; lcol = col;
                }
                all_largest = Math.max(curr_largest, all_largest);
            }

        StdOut.println("Maximum Grid Product is " + all_largest);
        StdOut.println("Row = " + lrow + " Col = " + lcol);
    }

    public static void main(String[] args) {

        //Take command line input of size of grid (It is a Square Grid in this Problem)
        int grid_size = Integer.parseInt(args[0]);
        int[][] grid = new int[grid_size][grid_size];

        //Read the grid data from a standard input.
        int i = 0;
        while(!StdIn.isEmpty()){
            String[] line = StdIn.readLine().split(" ");
            for(int j = 0; j < line.length; j++)
                grid[i][j] = Integer.parseInt(line[j]);
            i++;
        }

        //Test if the data input is stored correctly in relevant data structures.
        /*for(int j = 0; j < grid.length; j++) {
            for (int k = 0; k < grid.length; k++) {
                StdOut.print(grid[j][k] + " ");
            }
            StdOut.println();
        }*/

        computeLargestProduct(grid);
    }
}
