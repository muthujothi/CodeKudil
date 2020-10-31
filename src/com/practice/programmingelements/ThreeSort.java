package com.practice.programmingelements;

import edu.princeton.cs.algs4.StdOut;

public class ThreeSort {

    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c  = Integer.parseInt(args[2]);

        int sum = a + b + c;
        int min = Math.min(a, Math.min(b, c));
        int max = Math.max(a, Math.max(b, c));
        int middle = sum - (min + max);

        StdOut.println(min + " " + middle + " " + max);
    }

}
