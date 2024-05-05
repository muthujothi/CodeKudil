package com.practice.conditionalsandloops;

import edu.princeton.cs.algs4.StdOut;

public class NthPrime {

    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        int no_of_primes = 0;

        int i = 2;
        long current_prime = 0;
        while(no_of_primes < n){
            boolean isPrime = true;
            for(int j = 2; j <= i/j; j++){
                if(i%j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                current_prime = i;
                no_of_primes++;
            }
            i++;
        }
        StdOut.println(n + " th Prime Number is " + current_prime);

    }
}
