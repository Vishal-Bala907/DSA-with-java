package com.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SingleNumber {

    public static void main(String[] args) {
        int[] nums  = {4,1,2,1,2};

        ArrayList<Integer> integers = new ArrayList<>();
        for(int i = 0; i<nums.length; i++) {

            if(integers.contains(nums[i])) {
               integers.remove(Integer.valueOf(nums[i]));
            }else {
                integers.add(nums[i]);
            }
        }
        integers.get(0);
        System.out.println(integers);


    }
}
