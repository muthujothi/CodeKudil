package com.practice.conditionalsandloops;


import edu.princeton.cs.algs4.StdOut;

public class LargeFactorial {

    public static void main(String[] args) {

        int N = Integer.parseInt(args[0]);

        String result = String.valueOf(N*362880);//99*(9..1)

        for(int i = N-1; i >= 10; i--){ //Factorial Loop (98*97...*10)
            String multiplicand = String.valueOf(i);

            String[] intermediate_results = new String[2];//Intermediate products.
            for(int k = 0; k < intermediate_results.length; k++)
                intermediate_results[k] = "";

            for(int d = multiplicand.length()-1, idx=0; d >= 0; d--, idx++){ //Digits Loop of each term to be multiplied.
                int carry = 0;
                for(int r = result.length()-1; r >= 0; r--){
                    int prd = Integer.valueOf(multiplicand.substring(d,d+1)) *
                              Integer.valueOf(result.substring(r,r+1)) + carry;
                    intermediate_results[idx] = String.valueOf(prd%10) + intermediate_results[idx];
                    carry = prd / 10;
                }
                if(carry > 0)
                    intermediate_results[idx] = String.valueOf(carry) + intermediate_results[idx];
            }

            int idx2 = intermediate_results[1].length()-1;
            int add_carry = 0;
            String ans = "";
            for(int idx1 = intermediate_results[0].length()-2; idx1 >=0; idx1--, idx2--){
                int sum = Integer.valueOf(intermediate_results[0].substring(idx1,idx1+1)) +
                        Integer.valueOf(intermediate_results[1].substring(idx2,idx2+1)) + add_carry;
                ans = String.valueOf(sum%10) + ans;
                add_carry = sum/10;
            }
            //Compute intermediate_results[1].substring(0,idx2+1) + add_carry and append that result
            String prd1 = intermediate_results[1].substring(0,idx2+1);
            String prd2 = "";
            int ca = add_carry;
            for(int p = prd1.length()-1; p >= 0; p--){
                int s = Integer.valueOf(prd1.substring(p, p+1)) + ca;
                prd2 = String.valueOf(s%10) + prd2;
                ca = s/10;
            }
            if(ca > 0)
                prd2 = String.valueOf(ca) + prd2;
            result = prd2 +
                      ans +
                    intermediate_results[0].substring(intermediate_results[0].length()-1, intermediate_results[0].length());

        }

        StdOut.println("Result is " + result);

        int total = 0;
        for(int i = 0; i < result.length(); i++)
            total += Integer.valueOf(result.substring(i,i+1));

        StdOut.println("Sum of Digits is " + total);
    }
}
