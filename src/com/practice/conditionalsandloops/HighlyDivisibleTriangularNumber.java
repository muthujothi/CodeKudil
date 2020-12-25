package com.practice.conditionalsandloops;

import edu.princeton.cs.algs4.StdOut;

public class HighlyDivisibleTriangularNumber {

    public static int factorLength(long n){
        int f_length = 0;

        for(int i = 1; i <= n/i; i++){
            if(n % i == 0)
                f_length += 2;
        }

        return f_length;
    }

    public static void main(String[] args) {

        //Search for the Triangular Number which has got 'n' factors.
        int n = Integer.parseInt(args[0]);

        int i = 1;
        int f_total = 1;
        long t_number = 1;

        while(f_total < n){
            i = i+1;
            t_number = (i * (i+1))/2;
            f_total = factorLength(t_number);
            //StdOut.println("Number is " + t_number + " No.Of Factors are " + f_total);
        }

        StdOut.println("Highly Divisible Triangular Number with atleast " + n + " factors is " + t_number + " with total factors being " + f_total);

    }
}
