package org.dsa.java.sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int[] arr) {

        int min_idx  = 0;
        for(int i =0; i<arr.length; i++) {
            min_idx = i;
            for(int j = i + 1; j < arr.length; j++) {

                if(arr[j] < arr[min_idx]) {
                    min_idx = j;
                }

            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }

    }

    public static void main(String[] args) {
        int[] arr = {1,54,0,3,3,67,23};
        selectionSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
