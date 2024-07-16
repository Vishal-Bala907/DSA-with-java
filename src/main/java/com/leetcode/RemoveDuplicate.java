package com.leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class RemoveDupli {
    public int removeDuplicates(int[] nums) {

//        List<Integer> list = new ArrayList<>();

//        int[] arr = new int[nums.length];
        int j =0 , duplicate = 0;
        for (int i = 1; i < nums.length-1; i++) {
            if (nums[i] == nums[i-1]) {
//                list.add(nums[i]);
                if(nums[i]!=nums[i+1]){
                nums[j] = nums[i];
                duplicate++;
                j++;
                }
            }
        }
//        return list.size();
        return duplicate;
    }
}
public class RemoveDuplicate {
    public static void main(String[] args) {
//        int[] nums = new int[] {0,0,1,1,1,2,2,3,3,4};
        int[] nums = new int[] {1,1,2};
        RemoveDupli removeDupli = new RemoveDupli();
        int arr =  removeDupli.removeDuplicates(nums);

        System.out.println(arr);
        for(int n:nums){
            System.out.print(n+" ");
        }
    }
}
