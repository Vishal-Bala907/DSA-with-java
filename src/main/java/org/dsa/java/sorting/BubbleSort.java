package org.dsa.java.sorting;

import java.util.Arrays;

//TODO Pushes the heavy/larger element to the last position
class SortInBubble{
    public int[] bubbleSort(int[] arr){
//        for(int i=0; i<arr.length-1; i++){
//            for(int j=0; j<arr.length-i-1; j++){
//                if(arr[j] > arr[j+1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j] = temp;
//                }
//            }
//        }

        return arr;
    }
}
public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {45,23,878,23,56,34,78,345,787,434};
//! time complexity = O(n^2) worst
        for(int i=0; i<arr.length-1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j] = temp;
                }
            }
        }
        for(int i=0; i<arr.length-1; i++) {
            System.out.print(arr[i]+" , ");
        }

    }
}
