package com.practice.programmingelements;

import edu.princeton.cs.algs4.StdOut;

public class RGBtoCMYK {

    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int g = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);

        double w = Math.max(Math.max(r/255.0, g/255.0),b/255.0);
        double c = (w - (r/255.0))/w;
        double y = (w - (g/255.0))/w;
        double m = (w - (b/255.0))/w;
        double k = 1 - w;

        StdOut.println("Cyan " + c);
        StdOut.println("Yellow " + y);
        StdOut.println("Magenta " + m);
        StdOut.println("Black " + k);
    }
}
