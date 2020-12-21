package com.practice.conditionalsandloops;

import edu.princeton.cs.algs4.StdOut;

public class TwoSort {

    public static void main(String[] args) {

        //Take two integers as input from the cmdline and put them in
        //increasing order.

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        //Is a is bigger than b then, swap a and b. else keep it as is.
        if(a > b){
            int t = a;
            a = b;
            b = t;
        }
        StdOut.println("a = " + a + " b = " + b);
    }
}
