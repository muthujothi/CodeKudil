package com.practice.conditionalsandloops;

import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;
import java.util.HashMap;

public class CollatzLongestChain {

    public static void main(String[] args) {

        int N = Integer.parseInt(args[0]);
        //long[] chain = new long[N+1]; //Index it from 1 to N, for saving the computation results.
        HashMap<Long, Long> m_num_length = new HashMap<>();

        //chain[1] = 1; //Length of chain starting at 1 is 1.(Base Case)
        int snum_longest_chain = 1;
        long len_longest_chain = 1;

        for(int k = 2; k <= N; k++){
            long i = k;
            //StringBuilder r_chain = new StringBuilder(); //Generating the Sequence throws an out of memory error.
            long chain_length = 1;
            while(i != 1){
                if(m_num_length.containsKey(i)){
                    chain_length += m_num_length.get(i);
                    break;
                }
                chain_length++;
                if(i % 2 == 0){
                    //r_chain.append(i + " ");
                    i = i / 2;
                }else{
                    //r_chain.append(i + " ");
                    i = (3*i) + 1;
                }
            }
            //r_chain.append(i + " ");
            //chain[k] = chain_length;
            m_num_length.put(i, chain_length);
            if(chain_length > len_longest_chain){
                snum_longest_chain = k;
                len_longest_chain = chain_length;
            }
            //StdOut.print(r_chain.toString() + " --> " + chain_length);
            //StdOut.println();
        }

        StdOut.println("Starting Number of Longest Chain is " + snum_longest_chain + " with length being " + len_longest_chain);
    }
}
