package com.kkr.sortingAlgorithms;

import java.util.Arrays;

public class SortingMain {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, -5, 1, 5, -4, -1, 4, 0, -3, -2};

        int[] insertionSortResult = InsertionSort.sort(new int[]{2, 3, -5, 1, 5, -4, -1, 4, 0, -3, -2});
        printArray(insertionSortResult);

        int[] mergeSortResult = MergeSort.sort(new int[]{2, 3, -5, 1, 5, -4, -1, 4, 0, -3, -2});
        printArray(mergeSortResult);

        int[] quickSortResult = QuickSort.sort(new int[]{2, 3, -5, 1, 5, -4, -1, 4, 0, -3, -2});
        printArray(quickSortResult);

        int[] heapSortResult = HeapSort.sort(new int[]{2, 3, -5, 1, 5, -4, -1, 4, 0, -3, -2});
        printArray(heapSortResult);
        int maxVal = HeapSort.extractMax(heapSortResult);
        printArray(heapSortResult);

        int[] bubbleSortResult = BubbleSort.sort(new int[]{2, 3, -5, 1, 5, -4, -1, 4, 0, -3, -2});
        printArray(bubbleSortResult);

    }

    private static void printArray(int[] arr){
        System.out.println(Arrays.toString(arr));
    }
}
