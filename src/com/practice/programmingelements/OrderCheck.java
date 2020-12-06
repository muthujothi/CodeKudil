package com.practice.programmingelements;

import edu.princeton.cs.algs4.StdOut;

public class OrderCheck {

    public static void main(String[] args) {

        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        double z = Double.parseDouble(args[2]);

        boolean inc_order = (x < y) && (x < z) && (y < z);
        boolean dec_order = (x > y) && (x > z) && (y > z);

        StdOut.println(inc_order || dec_order);
    }
}
