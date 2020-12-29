package com.practice.bottomup;

import edu.princeton.cs.algs4.StdOut;

public class LetterNumberCounts {

    public static void main(String[] args) {

        int N = Integer.parseInt(args[0]); //Limit to word the numbers.
        //String[] words = new String[N+1];
        String[] words = new String[1001];

        words[0] = " "; words[1] = "One"; words[2] = "Two"; words[3] = "Three";
        words[4] = "Four"; words[5] = "Five"; words[6] = "Six"; words[7] = "Seven";
        words[8] = "Eight"; words[9] = "Nine"; words[10] = "Ten"; words[11] = "Eleven";
        words[12] = "Twelve"; words[13] = "Thirteen"; words[14] = "Fourteen"; words[15] = "Fifteen";
        words[16] = "Sixteen"; words[17] = "Seventeen"; words[18] = "Eighteen"; words[19] = "Nineteen";
        words[20] = "Twenty";
        words[30] = "Thirty"; words[40] = "Forty"; words[50] = "Fifty";
        words[60] = "Sixty"; words[70] = "Seventy"; words[80] = "Eighty"; words[90] = "Ninety";
        words[100] = "One Hundred";
        words[200] = "Two Hundred"; words[300] = "Three Hundred"; words[400] = "Four Hundred";
        words[500] = "Five Hundred"; words[600] = "Six Hundred"; words[700] = "Seven Hundred"; words[800] = "Eight Hundred";
        words[900] = "Nine Hundred"; words[1000] = "One Thousand";

        for(int i = 1; i <= N; i++){
            if(words[i] != null)
                continue;
                //StdOut.println(words[i] + " ");
            else{//Turn the index i into String and covert into positional expanded form.
                String word_form = "";
                String num = Integer.toString(i);
                for(int k = num.length()-1, exp=0; k >=0; k--, exp++){
                    if(num.length() == 3 && Integer.valueOf(num)%100 >= 11 && Integer.valueOf(num)%100 <= 19)
                        word_form = words[Integer.parseInt(num.substring(0,1))*100] + " " +  words[Integer.valueOf(num)%100];
                    else {
                        int look_up = (int) Math.pow(10, exp) * Integer.parseInt(num.substring(k, k + 1));
                        word_form = words[look_up] + " " + word_form;
                    }
                }
                if(num.length() == 3 && Integer.valueOf(num)%100!=0)
                    word_form = word_form + " and";
                words[i] = word_form;
                //StdOut.println(words[i]);
            }
        }

        long total = 0;
        for(int i = 1; i <= N; i++){
            String[] num_parts = words[i].split(" ");
            for(int k = 0; k < num_parts.length; k++)
                total += num_parts[k].length();
        }

        StdOut.println("Total Letters Used to Write Till 1000 is " + total);
    }
}
