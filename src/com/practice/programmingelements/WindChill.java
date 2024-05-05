package com.practice.programmingelements;

import edu.princeton.cs.algs4.StdOut;

/**
 * Given the temperature t in Farenheit, and wind speed
 * in v miles/hour, the effective temperature (wind chill)
 * is calculated as follows,
 * w = 35.74 + 0.6215t + (0.4275t - 35.75)v^0.16
 */
public class WindChill {

    public static void main(String[] args) {

        double t = Double.parseDouble(args[0]);
        double v = Double.parseDouble(args[1]);

        double w = 35.74 + (0.6215*t) + (((0.4275*t) - 35.75)*Math.pow(v,0.16));

        StdOut.println("Temperature (in Farenheit) " + t);
        StdOut.println("Wind Speed (in miles/Hour) " + v);
        StdOut.println("Wind Chill (Effective Temperature) is " + w);
    }
}
