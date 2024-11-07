package com.leetcode.hard;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MedianOf2SortedArrays {


    public static void main(String[] args) {
        int[] nums1 = {1,3};
        int[] nums2 = {2,4};

        int[] arr3 = new int[nums1.length + nums2.length];

//        public static native void arraycopy(Object src,  int  srcPos,
//        Object dest, int destPos,
//        int length);
        System.arraycopy(nums1, 0 , arr3, 0,nums1.length);
        System.arraycopy(nums2, 0 , arr3, nums1.length,nums2.length);

        Arrays.sort(arr3);
//        System.out.println(Arrays.toString(arr3));

        // median
        if(arr3.length % 2 != 0) {
            System.out.println((double) arr3[(arr3.length / 2)]);
        } else {
            double med = (double) (arr3[(arr3.length / 2)] + arr3[(arr3.length / 2) - 1]) / 2;
        }

//        System.out.println(Arrays.toString(arr3));



//        Collections.

    }
}
