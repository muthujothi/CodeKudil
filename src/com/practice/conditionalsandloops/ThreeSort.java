package com.practice.conditionalsandloops;

import edu.princeton.cs.algs4.StdOut;

public class ThreeSort {

    public static void main(String[] args) {

        //Take three integers from command line and put them in sorted order.

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        /*
        Method
        1. Think of the values in the positions denoted by a, b and c.
        2. The value in the position a must be smaller then b and c, the value in position b should be smaller then c.
        3. As a first step find the smallest of the three and place it in a.
        4. Then between the remaining two, perform a two sort.
         */

        if(a > b){ int t = a; a = b; b = t;}
        if(a > c){ int t = a; a = c; c = t;} //Makes a smaller than b and c.
        if(b > c){ int t = b; b = c; c = t;} //Performs a two sort between b and c.

        StdOut.println(a + " " + b + " " + c);
    }
}
