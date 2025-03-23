package org.dsa.java.sorting.merge;

import java.util.Arrays;

public class MergeSortPractice {

    public static void mergeSort(int si , int ei , int[] arr) {

            if(si >= ei)
                return;

            int mid = si + (ei - si) / 2;
            mergeSort(si , mid , arr);
            mergeSort(mid+1 , ei , arr);
            sort(si , mid , ei ,arr);


    }

    private static void sort(int si, int mid, int ei, int[] arr) {

        int start = si;
        int middle = mid  + 1;
        int[] newArr = new int[ei - si  + 1];
        int x = 0;

        while(start <= mid && middle <= ei ) {

            if(arr[start] <= arr[middle]) {
                    newArr[x++] = arr[start++];
            } else {
                newArr[x++] = arr[middle++];
            }

        }

        while(start <= mid) {
            newArr[x++] = arr[start++];
        }
        while (middle <= ei) {
            newArr[x++] = arr[middle++];
        }

        for(int i=0, j=si; i < newArr.length; i++,j++) {
            arr[j] = newArr[i];
        }

    }

    public static void main(String[] args) {
        int[] arr = {1,54,0,3,3,67,23};
        mergeSort(0 , arr.length-1 , arr);

        System.out.println(Arrays.toString(arr));
    }

}
