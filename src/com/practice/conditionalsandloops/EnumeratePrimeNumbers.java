package com.practice.conditionalsandloops;

public class EnumeratePrimeNumbers {

    public static void main(String[] args) {

        //To find the sum of all prime numbers from 1 till 100.
        int total_sum = 0;
        int i = 1;

        //Start from 2 till 100
        while(i <= 100){
            //Check if 'i' is a prime number. If yes, then add it to the running sum in total_sum, else go to next i.
            //Now how to check if 'i' is a prime number?

            //if 'i' is divisible by any number between 2 till (i-1) then 'i' is not a prime number else it is a prime.
            if(i == 1) {
                i = i + 1;
                continue;
            }

            if(i == 2){
                total_sum = total_sum + i; //since 2 is a prime, add it to the running sum
                i = i + 1;
                continue;
            }

            int j = 2;
            boolean is_prime = true;
            while(j <= i-1){ // start from 2 and go till i-1 to check for divisibility
                if(i % j == 0){
                    is_prime = false;
                    break;
                }
                j = j + 1;
            }

            if(is_prime)
                total_sum = total_sum + i;
            i = i +1;
        }

        System.out.println("Sum of prime numbers in the range is " + total_sum);
    }
}
