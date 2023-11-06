package com.kkr.sortingAlgorithms;

/**
 * Time Complexity O(n*logn)
 * Space Complexity O(n) for extra array and O(logn) for recursion stack
 * Out of space soring algorithm
 * */
public class MergeSort {
    public static int[] sort(int[] arr){
        mergeSort(arr, 0, arr.length-1);
        return arr;
    }

    private static void mergeSort(int[] arr, int p, int r){
        if(p<r){
            int q = (p+r)/2;
            mergeSort(arr,p, q);
            mergeSort(arr,q+1, r);
            merge(arr, p, q, r);
        }
    }

    private static void merge(int[] arr, int p, int q, int r){
        int n1 = q-p+1;
        int n2 = r-q;
        int[] L = new int[n1+1];
        int[] R = new int[n2+1];
        int i=0, j=0;

        for(; i<n1; i++){
            L[i] = arr[p+i];
        }
        L[n1] = Integer.MAX_VALUE;
        for(; j<n2; j++){
            R[j] = arr[q+1+j];
        }
        R[n2] = Integer.MAX_VALUE;
        i = 0; j = 0;
        for(int k=p; k<=r; k++){
            if(L[i]<R[j]){
                arr[k] = L[i]; i++;
            } else{
                arr[k] = R[j]; j++;
            }
        }
    }
}
