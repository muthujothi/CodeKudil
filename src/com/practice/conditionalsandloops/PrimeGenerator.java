package com.practice.conditionalsandloops;

import edu.princeton.cs.algs4.StdOut;

public class PrimeGenerator {

    public static void main(String[] args) {
        //Generate the Prime Numbers until the given integer n.

        int n = Integer.parseInt(args[0]);

        //Iterate from 2 till n.
        for(int i = 2; i <= n; i++){
            //Loop from 2 till Sqrt(i) and check for factor existence.
            //If factor exists, break the loop and iterate on outer loop.
            //Else, print out 'i' as a Prime Number.
            boolean isPrime = true;
            for(int j = 2; j <= i/j; j++){
                if(i % j == 0) { //If i is evenly divisble by j, then a factor exist for i and hence i is not prime.
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
                StdOut.print(i + " ");
        }
    }
}
