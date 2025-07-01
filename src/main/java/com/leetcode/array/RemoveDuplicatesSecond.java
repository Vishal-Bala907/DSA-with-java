package com.leetcode.array;
/*
*
* Q.N: 80
* Given an integer array nums sorted in non-decreasing order,
* remove some duplicates in-place such that each unique element appears at most twice.
* The relative order of the elements should be kept the same.
*
* https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/
*
* */
public class RemoveDuplicatesSecond {

    public int removeDuplicates(int[] nums) {

        int k = 0;
        int fr = 0;

        if(nums.length <= 2) {
            return nums.length;
        }

        for(int i =0; i<nums.length-1; ) {
            nums[k] = nums[i];
            k++;
            fr++;
            for(int j = i+1; j<nums.length; ) {
                if(nums[i]==nums[j]) {
                    if(fr < 2) {

                        nums[k] = nums[j];
                        j++;
                        k++;
                        fr++;
                        i++;
                    } else {
                        j++;
                        i++;
                    }
                } else {
//                    System.out.println(j);
                    if(j >= nums.length - 1) {
//                        System.out.println(j);
                        nums[k] = nums[j];
                        fr = 0;
                        k++;
                        i=nums.length;
                        break;
                    } else {
                        fr = 0;
                        i=j;
                        break;
                    }

                }
            }
        }

        return (k);
    }

    public static void main(String[] args) {
        RemoveDuplicatesSecond obj = new RemoveDuplicatesSecond();
//        int[] arr1 = {1,1,1,2,2,3};
//        int[] arr1 = {0,0,1,1,1,1,2,3,3};
        int[] arr1 = {1};
        System.out.println(obj.removeDuplicates(arr1));
       for(int i : arr1) {
           System.out.print(i+" , ");
       }
    }
}
