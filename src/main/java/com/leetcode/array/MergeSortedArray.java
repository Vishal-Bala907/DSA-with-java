package com.leetcode.array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        int[] arr = new int[m+n];
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<m; i++) {
            list.add(nums1[i]);
        }
        for(int i=0; i<n; i++) {
            list.add(nums2[i]);
        }
        Collections.sort(list);

        for(int i=0; i<nums1.length; i++) {
            nums1[i] = list.get(i);
        }


//        int min = Math.min(m,n);
//        int i =0 , j=0,k=0;

//       while(i < min && j < min ) {
//            if(nums1[i] <= nums2[j]) {
//                arr[k] = nums1[i];
//                k++;i++;
//            }else{
//                arr[k] = nums2[j];
//                k++;j++;
//            }
//        }

//        while(i < m) {
//            arr[k] = nums1[i];
//            k++;i++;
//        }
//
//        while(j < nums2.length) {
//            arr[k] = nums2[j];
//            k++;j++;
//        }
//
//        System.arraycopy(arr, 0, nums1, 0, nums1.length);
    }

    public static void main(String[] args) {
        int[] arr1 = {4,0,0,0,0,0};
        int[] arr2 = {1,2,3,5,6};
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        mergeSortedArray.merge(arr1, 1, arr2, 5);

        for(int a : arr1) {
            System.out.print(a +" ,");
        }

    }
}
