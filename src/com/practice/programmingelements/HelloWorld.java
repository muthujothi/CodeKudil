package com.practice.programmingelements;

import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

/*
C:\Learnings\CodeKudil\out\production\CodeKudil>java -cp .;C:\Learnings\IntroCSSedgewick\algs4.jar com.practice.programmingelement
s.ThreeSort 3 2 1
 */
public class HelloWorld {

    public static void main(String[] args) {
        //int i = Integer.parseInt("08");
        //StdOut.println("Hello World");
        //StdOut.println(i);

        String test = "Eighty";
        String[] test_arr = test.split(" ");
        int total = 0;
        for(int i = 0; i < test_arr.length; i++){
                total += test_arr[i].length();
        }
        StdOut.println(total);
    }
}
