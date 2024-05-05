package com.practice.programmingelements;

import edu.princeton.cs.algs4.StdOut;

public class CartesianToPolar {

    public static void main(String[] args) {

        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);

        double r = Math.sqrt((x*x) + (y*y));
        double theta = Math.atan2(y, x);

        StdOut.println("x-coordinate = " + x);
        StdOut.println("y-coordinate = " + y);
        StdOut.println("Converted to Polar Coordinates");
        StdOut.println("Radial Distance = " + r);
        StdOut.println("Polar Angle = " + theta);

    }
}
