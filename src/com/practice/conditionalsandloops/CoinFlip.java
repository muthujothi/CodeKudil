package com.practice.conditionalsandloops;

import edu.princeton.cs.algs4.StdOut;

public class CoinFlip {

    public static void main(String[] args) {
        //If the Random Number generated is < 0.5, term the outcome as HEADS
        //Else, term the outcome as TAILS
        if(Math.random() < 0.5)
            StdOut.println("HEADS");
        else
            StdOut.println("TAILS");
    }
}
