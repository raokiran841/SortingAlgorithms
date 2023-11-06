package com.kkr.sortingAlgorithms;

/**
 * Time complexity is O(n^2)
 * Space Complexity is O(1)
 *
 * Inplace sorting algorithm
 * */
public class BubbleSort {

    public static int[] sort(int[] arr){
        int swapped, i, j;
        int n = arr.length;
        for(i=0; i<n; i++){
            swapped = 0;
            for(j=0; j<n-1-i; j++){
                if(arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                    swapped = 1;
                }
            }
            if(swapped == 0) break;
        }
        return arr;
    }

    private static void swap(int[] arr, int x, int y){
        int t = arr[x];
        arr[x] = arr[y];
        arr[y] = t;
    }
}
