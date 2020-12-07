package com.practice.programmingelements;

import edu.princeton.cs.algs4.StdOut;

public class GreatCircle {

    public static void main(String[] args) {

        double x1 = Math.toRadians(Double.parseDouble(args[0]));
        double y1 = Math.toRadians(Double.parseDouble(args[1]));
        double x2 = Math.toRadians(Double.parseDouble(args[2]));
        double y2 = Math.toRadians(Double.parseDouble(args[3]));

        double r = 6371.0;

        double d = 60*Math.toDegrees(Math.acos(Math.sin(x1)*Math.sin(x2) + Math.cos(x1)*Math.cos(x2)*Math.cos(y1-y2)));
        double haversine_d = 2*r * Math.asin(
                                    Math.sqrt(
                                            Math.pow(Math.sin((x2-x1)/2),2) +
                                            Math.cos(x1)*Math.cos(x2)*Math.pow(Math.sin((y2-y1)/2),2)
                                        ));

        StdOut.println("Distance in Nautical Miles " + d);
        StdOut.println("Distance in Kilometers " + haversine_d);
    }
}
