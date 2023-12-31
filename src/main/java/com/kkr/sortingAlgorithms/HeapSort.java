package com.kkr.sortingAlgorithms;

public class HeapSort {
    private static int heapSize = 0;

    /**
     * Time complexity for heap sort is O(nlogn)
     * Space Complexity is O(logn) for auxiliary stack space
     * */
    public static int[] sort(int[] arr){
        buildMaxHeap(arr);
        int n = arr.length;
        for(int i=n-1; i>=1; i--){
            swap(arr, 0, i);
            heapSize--;
            maxHeapify(arr, 0);
        }
        return arr;
    }

    /**
     * Time Complexity O(n) , NOT O(nlogn) because the heapify method doesn't take logn time
     * for all heights, it takes [n/ 2^(h+1)]*O(h) time as per height.*
     * which is nothing but = (nc/2)∑(h/2^h) => O(n)
     *
     * Space Complexity O(logn) auxiliary stack space for heapify method.
     * */
    private static void buildMaxHeap(int[] arr){
        heapSize = arr.length-1;
        for(int i = (heapSize/2)-1; i>=0; i--){
            maxHeapify(arr, i);
        }
    }

    /**
     * Time Complexity O(logn)
     * Space Complexity O(logn) auxiliary stack space
     * */
    private static void maxHeapify(int[] arr, int i){
        //System.out.println("i => "+ i + " : elem => "+ arr[i]);
        int l = 2*i + 1;
        int r = 2*i + 2;
        int max = 0;
        if(l <= heapSize && arr[l] > arr[i]){
            max = l;
        } else max = i;
        if(r <= heapSize && arr[r] > arr[max]){
            max = r;
        }
        if(max != i){
            swap(arr, max, i);
            maxHeapify(arr, max);
        }
    }

    private static void swap(int[] arr, int x, int y){
        int t = arr[x];
        arr[x] = arr[y];
        arr[y] = t;
    }

    /**
     * @param heap A max heap
     * */
    public static int extractMax(int[] heap){
        heapSize = heap.length-1;
        if(heapSize <= 0){
            return Integer.MIN_VALUE;
        }
        int max = heap[0];
        heap[0] = heap[heapSize];
        heapSize--;
        maxHeapify(heap, 0);
        return max;
    }
}
