package com.practice.conditionalsandloops;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class LargeSum {

    public static String computeSum(String[] numbers, int d){
        String result = "";

        int carry = 0;
        for(int i = (d-1); i >=0; i--){
            int total = 0;
            for(int j = 0; j < numbers.length; j++){
                total = total + Integer.parseInt(numbers[j].substring(i, i+1));
            }
            total = total + carry;
            result = total % 10 + result;
            carry = total / 10;
        }

        return carry+result;
    }

    public static void main(String[] args) {

        int d = Integer.parseInt(args[0]); //No.of Digits in Each Number
        int n = Integer.parseInt(args[1]); //Total Number of numbers to be summed.

        String[] numbers = new String[n];
        int idx = 0;
        while(!StdIn.isEmpty()){
            String num_str = StdIn.readLine();
            numbers[idx] = num_str;
            idx++;
        }

        //for(int i = 0; i < numbers.length; i++)
        //    StdOut.println(numbers[i]);

        StdOut.println(computeSum(numbers, d));
    }
}
