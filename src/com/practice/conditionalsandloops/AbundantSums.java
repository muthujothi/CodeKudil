package com.practice.conditionalsandloops;

import edu.princeton.cs.algs4.StdOut;

import java.util.ArrayList;
import java.util.Arrays;

public class AbundantSums {

    public static boolean binarySearch(int[] a,int lo, int hi, int key){
        //{2,3,4,5,6,7,8,9,10}
        if(lo == hi){
            if(a[lo] == key)
                return true;
            else
                return false;
        }

        while((lo < hi) & (lo < a.length-1)){
            int mid = (lo + hi)/2;
            //StdOut.println(" lo = " + lo + " hi = " + hi + " mid = " + mid + " key = " + key);
            if(key > a[mid])
                lo = mid;
            else if(key < a[mid])
                hi = mid;
            else
                return true;
        }
        return false;
    }

    public static void main(String[] args) {

        ArrayList<Integer> abundant_nos = new ArrayList<>();
        //For every number from 2 till 28123, find out all the numbers which are
        //abundant numbers. (Sum of proper divisors > number)
        for(int i = 2; i <= 40; i++){
            int fact_total = 1; //1 is always a factor of every number.
            for(int j = 2; j <= i/j; j++){
                if(i%j == 0){//If 'j' divides 'i' evenly, then j is a factor of i. (i/j) is another factor
                    fact_total += j;
                    if(j != i/j)
                        fact_total += i/j;
                }
            }
            //StdOut.println("i = " + i + " fact_total = " + fact_total);
            if(fact_total > i)
                abundant_nos.add(i);
        }

        StdOut.println(abundant_nos);

        //Start from 1 and check go until 28123, checking if each number can be expressed as a sum of two
        //numbers fom the abundant_nos list.
        int[] abundant_numbers = abundant_nos.stream().mapToInt(i -> i).toArray();
        StdOut.println("Lenght of array is " + abundant_numbers.length + " first element being " + abundant_numbers[0] + " and last element being " + abundant_numbers[abundant_numbers.length-1]);


        /*long total = 0;//Sum from 1 to 12.
        for(int i = 1; i < 28123; i++){
            StdOut.println("processing i = " + i);
            int j = 0;
            boolean isAbundantSum = false;
            while(i > abundant_numbers[j] & j < abundant_numbers.length){
                //If abundant_numbers[j] is one part, then (i - abundant_numbers[j]) is the other part.
                int key = i - abundant_numbers[j];
                //StdOut.println("Checking i = " + i + " and Key = " + key);
                //Search for key in abundant_nos.//Let us use a linear search.

                //Linear search is time consuming.
                //if(abundant_nos.contains(key))
                //    isAbundantSum = true;

                //Do a binary search from 0 till j, because (i - abundant_numbers[j]) must be < j.
                //if(binarySearch(abundant_numbers,0, j, key)) {
                //    isAbundantSum = true;
                //}

                if(Arrays.binarySearch(abundant_numbers, key)>=0)
                    isAbundantSum = true;
                j++;
            }
            if(!isAbundantSum)
                total += i;
        }//Outer loop checking for each 'i' if it can be expressed as sum of two abundant numbers.

        StdOut.println("Sum of Numbers that can't be expressed as sum of two abundant numbers is " + total);*/

        /*int[] test = {2,3,4,5,6,7,8,9,10};
        StdOut.println(binarySearch(test, 0, test.length, 10));*/
    }
}
