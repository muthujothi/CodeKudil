package com.practice.conditionalsandloops;

import edu.princeton.cs.algs4.StdOut;

import java.util.ArrayList;
import java.util.Arrays;

public class NonAbundantSums {

    public static int binarySearch(int[] data, int low, int high, int key){
        //Search for the key in the data[]. If key is present in data, then return the index of the element (0 to n-1)
        //Else return -1.
        while(low <= high){
            int mid = low + (high - low)/2;

            if(data[mid] > key) high = mid - 1;
            else if(data[mid] < key) low = mid + 1;
            else return mid;
        }
        return -1;
    }

    public static int[] findAbundantNumbers(int n){
        ArrayList<Integer> ls_abundant_nos = new ArrayList<>();

        for(int i = 1; i <= n; i++){
            int factor_sum = 1; // 1 is a factor of any number.
            for(int j = 2; j <= i/j; j++){ //Start from 2 and check until sqrt(n) to find the factors.
                if(i % j == 0){ //if 'j' divides 'i' evenly then, 'j' is a factor
                    factor_sum += j;
                    if(j != i/j)
                        factor_sum += i/j;
                }
            }
            if(factor_sum > i)
                ls_abundant_nos.add(i);
        }
        return ls_abundant_nos.stream().mapToInt(i -> i).toArray();
    }

    public static long calculateNonAundantSum(int[] abundant_numbers){
        long total = 0;

        for(int i = 1; i <= 28123; i++) {
            boolean expressble_as_sum = false;
            for (int j = 0; j < abundant_numbers.length; j++) {
                if (i < abundant_numbers[j]) break;
                //i = abundant_numbers[j] + (i-abundant_numbers[j])
                int key = i -  abundant_numbers[j];
                if(binarySearch(abundant_numbers, 0, j, key)!=-1){
                    expressble_as_sum = true;
                    break;
                }
            }
            if(!expressble_as_sum) {
                //StdOut.println("Numbers being summed are " + i);
                total += i;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        //Find the sum of all numbers that can't be expressed as the sum of two abundant numbers.
        //Fact - Any number > 28,123 can be expressed as sum of two abundant numbers.
        //Deduction -  This means that numbers that can't be expressed sum of two abundant numbers must lie less than this limit.
        //So, if we find all abundant numbers below this limit, that we can check if each number until 28,123 can
        //be expressed as sum of two numbers from that abundant nos list. If no, that is a number we are looking for and
        //keep it to the track.
        int n = Integer.parseInt(args[0]);
        int[] abundant_nos = findAbundantNumbers(n);
        StdOut.println(calculateNonAundantSum(abundant_nos));


        //StdOut.println(Arrays.toString(abundant_nos));
        //StdOut.println(binarySearch(abundant_nos, 0, abundant_nos.length-1, 480));
    }
}
