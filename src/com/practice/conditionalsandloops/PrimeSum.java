package com.practice.conditionalsandloops;

import edu.princeton.cs.algs4.StdOut;

public class PrimeSum {

    public static void main(String[] args) {

        //Take an integer 'n' from command line input and compute the sum of prime numbers until n (n - inclusive)
        int n = Integer.parseInt(args[0]);
        long total = 0;

        for(int i = 2; i < n; i++){
            boolean isPrime = true; //Start with assumption that i is prime.
            for(int j = 2; j <= i/j; j++){ //Start from 2 and until Sqrt(i) in search of a factor for i.
                if(i%j == 0){ //If j divides i evenly, then i has a factor and it is not a prime.
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
                total += i;
        }
        StdOut.println("Prime Sum until " + n + " is " + total);
    }
}
