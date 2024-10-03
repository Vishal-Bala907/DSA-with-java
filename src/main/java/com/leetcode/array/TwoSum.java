package com.leetcode.array;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {

        int  sum = 0;
        int[] arr = {0,0};

        for(int i = 0;i<nums.length; i++) {
            for(int j = i+1;j<nums.length;j++) {
                sum = nums[i] + nums[j];
                if(sum == target) {
                    arr[0] = i;
                    arr[1] = j;
                    return arr;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        int[] ints = twoSum(new int[]{2, 7, 11, 15}, 9);/**/
//        int[] ints = twoSum(new int[]{3,2,4}, 6);/
//        int[] ints = twoSum(new int[]{3,3}, 6);
//        int[] ints = twoSum(new int[]{3,2,3}, 6);
//        int[] ints = twoSum(new int[]{2,5,5,11}, 10);
//        int[] ints = twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(ints[0]+" "+ints[1]);
    }
}
