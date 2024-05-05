package com.practice.programmingelements;

import edu.princeton.cs.algs4.StdOut;

public class MercatorProjection {

    public static void main(String[] args) {

        Double lamda_zero = Double.parseDouble(args[0]);
        Double latitude = Double.parseDouble(args[1]);
        Double longitude = Double.parseDouble(args[2]);

        int x = (int)(longitude - lamda_zero);
        double y = (0.5 * Math.log((1+Math.sin(latitude))/(1-Math.sin(latitude))));

        StdOut.println("Latitude " + latitude);
        StdOut.println("Longitude " + longitude);
        StdOut.println(" Post Conversion --->  ");
        StdOut.println("x-coordinate " + x);
        StdOut.println("y-coordinate " + y);
    }
}
