package com.practice.programmingelements;

import edu.princeton.cs.algs4.StdOut;

public class DragonCurveSimple {

    public static void main(String[] args) {

        String d0 = "F";
        String rev_d0 = "F";

        String d1 = d0 + "L" + rev_d0; //FLF
        String rev_d1 = d0 + "R" + rev_d0; //FRF

        String d2 = d1 + "L" + rev_d1; //FLFLFRF
        String rev_d2 = d1 + "R" + rev_d1; //FLFRFRF

        String d3 = d2 + "L" + rev_d2; //FLFLFRF L FLFRFRF
        String rev_d3 = d2 + "R" + rev_d2; //FLFLFRF R FLFRFRF

        String d4 = d3 + "L" + rev_d3;
        String rev_d4 = d3 + "R" + rev_d3;

        String d5 = d4 + "L" + rev_d4;

        StdOut.println(d0);
        StdOut.println(d1);
        StdOut.println(d2);
        StdOut.println(d3);
        StdOut.println(d4);
        StdOut.println(d5);
    }
}
