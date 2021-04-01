package com.practice.conditionalsandloops;

import edu.princeton.cs.algs4.StdOut;

public class DigitFifthPowers {

    public static void main(String[] args) {

        int n = 1000000;
        long sat_total = 0;

        for(int i = 32; i <= n; i++){
            String num = String.valueOf(i);
            int total = 0;
            for(int j = 0; j < num.length(); j++){
                total += Math.pow(Integer.parseInt(num.substring(j, j+1)), 5);
            }
            if(total == i) {
                StdOut.println(i);
                sat_total += i;
            }
        }

        StdOut.println("Total is " + sat_total);
    }
}
