package com.practice.conditionalsandloops;

public class TwoSum {

    //Search for key in range data[0, data.length).
    // If mid > key, range = (low, mid-1). If mid < key, range = (mid+1, high). Else the key is the mid element.
    public static int binarySearch(int[] data, int key){
        int low = 0; int high = data.length-1;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(data[mid] == key) return mid;
            else if(data[mid] > key) high = mid - 1;
            else if(data[mid] < key) low = mid + 1;
        }

        return -1;
    }

    //For each i, in data, do a binary search for (target-i) if present. Worst case O(Nlogn)
    public static String betterApproachTwoSumSearch(int[] data, int target){
        String indices = "No Pair Found.";

        for(int i = 0; i < data.length; i++){
            int search_key = target - data[i];
            int complement_index = binarySearch(data, search_key);
            if(complement_index != -1){
                indices = i + " " + complement_index;
                break;
            }
        }
        return indices;
    }

    //For each pair (i,j) in the data[], search if the sum equals the target. Worst case O(N^2)
    public static String bruteForceTwoSumSearch(int[] data, int target){
        String indices = "No Pair Found.";
        boolean is_pair_found = false;

        for(int i = 0; i < data.length; i++) {
            for (int j = (i + 1); j < data.length; j++) {
                if (data[i] + data[j] == target){
                    is_pair_found = true;
                    indices = i + " " + j;
                    break;
                }
            }
            if(is_pair_found) break;
        }

        return indices;
    }

    public static void main(String[] args){
        int[] input = {2, 20, 7, 11, 15};
        int target = 22;

        System.out.println("Brute::Two Sum Search " + bruteForceTwoSumSearch(input, target));
        System.out.println("Better Way::Two Sum Search " + bruteForceTwoSumSearch(input, target));
        //System.out.println(binarySearch(input, 11));
        //System.out.println(binarySearch(input, 2));
        //System.out.println(binarySearch(input, 15));
        //System.out.println(binarySearch(input, -111));
    }
}
