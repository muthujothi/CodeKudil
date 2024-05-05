package com.practice.conditionalsandloops;

import edu.princeton.cs.algs4.StdOut;

public class PowerDigit {

    public static void main(String[] args) {

        int N = Integer.parseInt(args[0]);
        String result = "128"; //Start from 2 power 7. (N > 7)

        int carry = 0;
        for(int i = 8; i <= N; i++){
            String new_result = "";
            for(int d = result.length()-1; d >=0; d--){
                int prd = (2 * Integer.parseInt(result.substring(d, d+1))) + carry;
                new_result = prd % 10 + new_result;
                carry = prd / 10;
            }
            if(carry != 0)
                new_result = carry + new_result;
            result = new_result;
            carry = 0;
        }

        StdOut.println("Result is " + result);
        long total = 0;
        for(int i = 0; i < result.length(); i++)
            total += Integer.parseInt(result.substring(i, i+1));
        StdOut.println("Power Digit Sum is " + total);
        StdOut.println("No of Digits in the Result is " + result.length());

    }

}
