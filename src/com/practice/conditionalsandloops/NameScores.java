package com.practice.conditionalsandloops;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;
import java.util.HashMap;

public class NameScores {

    public static long computeNameScores(String[] names){
        long total = 0;

        HashMap<Character, Integer> letter_map = new HashMap<>();
        letter_map.put('A', 1); letter_map.put('B', 2); letter_map.put('C', 3); letter_map.put('D', 4);
        letter_map.put('E', 5); letter_map.put('F', 6); letter_map.put('G', 7); letter_map.put('H', 8);
        letter_map.put('I', 9); letter_map.put('J', 10); letter_map.put('K', 11); letter_map.put('L', 12);
        letter_map.put('M', 13); letter_map.put('N', 14); letter_map.put('O', 15); letter_map.put('P', 16);
        letter_map.put('Q', 17); letter_map.put('R', 18); letter_map.put('S', 19); letter_map.put('T', 20);
        letter_map.put('U', 21); letter_map.put('V', 22); letter_map.put('W', 23); letter_map.put('X', 24);
        letter_map.put('Y', 25); letter_map.put('Z', 26); letter_map.put('"', 0);

        String name = null;
        for(int i = 0; i < names.length; i++){
            int letter_sum = 0;
            for(char c : names[i].toCharArray()){
                //StdOut.println(c);
                letter_sum += letter_map.get(c);
            }
            total += letter_sum * (i+1);
        }


        return total;
    }

    public static String[] insertionSort(String[] data){

        //StdOut.println("Input:: " + Arrays.toString(data));

        String temp = null;
        for(int i = 0; i < data.length; i++)
            for(int j = i+1; j < data.length; j++){
                if(data[j].compareTo(data[i]) < 0){//String in index 'j' is bigger than string in index 'i'.
                    //swap them.
                    temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }

        //StdOut.println("Output:: " + Arrays.toString(data));
        return data;
    }

    public static void main(String[] args) {

        String[] input = null;
        while(!StdIn.isEmpty())
            input = StdIn.readAllLines();
        String[] names = input[0].split(",");
        //names = insertionSort(names);

        StdOut.println(computeNameScores(insertionSort(names)));
        //insertionSort(new String[]{"AAZ", "AAB", "AAA", "AA", "A"});



    }
}
