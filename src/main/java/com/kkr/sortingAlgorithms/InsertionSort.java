package com.kkr.sortingAlgorithms;

/**
 * Time Complexity O(n^2),
 * Space Complexity O(1)
 * Inplace sorting algorithm
 * */
public class InsertionSort {

    public static int[] sort(int[] arr){
        int n = arr.length;
        for(int j=1; j<n; j++){
            int key = arr[j];
            int i = j-1;
            while(i>=0 && arr[i]>key){
                arr[i+1] = arr[i];
                i--;
            }
            arr[i+1] = key;
        }
        return arr;
    }

}
