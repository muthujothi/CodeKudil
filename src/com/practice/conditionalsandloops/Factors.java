package com.practice.conditionalsandloops;

import edu.princeton.cs.algs4.StdOut;

public class Factors {

    public static void main(String[] args) {

        long n = Long.parseLong(args[0]);

        //Use i <= Math.round(Math.sqrt(n)) O(n) is log N
        //or
        //(i*i) <= n which means (i <= n/i) Basic Operation. much better.
        for(int i = 2; i <= n/i; i++){
            while(n % i == 0){
                StdOut.print(i + " ");
                n = n / i;
            }
        }
        if(n > 1) StdOut.println(n + " ");
        else StdOut.println(" ");
    }
}
