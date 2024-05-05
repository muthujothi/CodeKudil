package com.practice.conditionalsandloops;

import edu.princeton.cs.algs4.StdOut;

public class CountingSundays {

    public static void countSundays(){

        int total_sundays = 0;

        for(int year = 1901; year <= 2000; year++)
            for(int mon = 1; mon <= 12; mon++){
                int y0 = year - (14 - mon)/12;
                int x = y0 + y0/4 - y0/100 + y0/400;
                int m0 = mon + 12 * ((14-mon)/12) - 2;
                int d0 = (1 + x + (31*m0)/12) % 7; //d is always 1 because we want to see if 1st of the month is Sunday

                if(d0 == 0)
                    total_sundays += 1;
            }

        StdOut.println("Total Sundays Falling on First of Month is " + total_sundays);
    }

    public static void main(String[] args) {

        countSundays();

        /*int y = 2021;
        int m = 1;
        int d = 1;

        int y0 = y - (14 -m)/12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12 * ((14-m)/12) - 2;
        int d0 = (d + x + (31*m0)/12) % 7;

        StdOut.println("Day of the Week " + d0);*/
    }
}
