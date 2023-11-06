package com.kkr.sortingAlgorithms;

/**
 * Time Complexity theta(n*logn)
 * In the worst case Time complexity O(n^2)
 * Space Complexity theta(logn)
 * In the worst case Space complexity O(n)
 * */
public class QuickSort {
    public static int[] sort(int[] arr){
        quickSort(arr, 0, arr.length-1);
        return arr;
    }

    private static void quickSort(int[] arr, int p, int r){
        if(p<r){
            int q = partition(arr, p, r);
            quickSort(arr, p, q-1);
            quickSort(arr, q+1, r);
        }
    }

    private static int partition(int[] arr, int p, int r){
        int j = p, i = p-1;

        for(; j<r; j++){
            if(arr[j] < arr[r]){
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, r);
        return i+1;
    }

    private static void swap(int[] arr, int a, int b){
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }

}
