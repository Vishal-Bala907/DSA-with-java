package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

// 217
public class containsDuplicate {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] nums = {1,2,3,4,5,6,7,3,2};
        for(int i : nums) {
            if(!map.containsKey(i)) {
                map.put(i,i);
            } else {
                System.out.println(true);
            }
        }
    }
}
