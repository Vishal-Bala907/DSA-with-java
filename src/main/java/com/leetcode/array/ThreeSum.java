package com.leetcode.array;

import java.util.*;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> mainList = new HashSet<>();

        if(nums.length == 3) {
            int sum = nums[0] + nums[1] + nums[2];

            if(sum == 0) {
                return List.of(List.of(nums[0] , nums[1] , nums[2]));
            } else {
                return List.of();
            }
        }

        int i = 0 , j = 1, k= 2;

        do {
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0) {
                    List<Integer> num = List.of(nums[i], nums[j], nums[k]);
                    mainList.add(num);
                }
                if(k < nums.length - 1) {
                    k++;
                } else if (k == nums.length - 1 && j < nums.length -2) {
                    j++;
                } else if (k == nums.length -1 && j == nums.length -2 && i < nums.length -3) {
                    i++;
                } else {
                    k = 0;
                    int sum2 = nums[i] + nums[j] + nums[k];
                    if(sum2 == 0) {
                        List<Integer> num = List.of(nums[i], nums[j], nums[k]);
                        mainList.add(num);
                    }
                }
            } while(k != 0);

        List<List<Integer>> LIST = new ArrayList<>();

        mainList.forEach(set-> {
            LIST.add(new ArrayList<>(set));
        });

        return LIST;
    }

    public static void main(String[] args) {
//        int[] nums = {0,0,0};
//        int[] nums = {0,1,1};
//        int[] nums = {-1,0,1,2,-1,-4};
//        int[] nums = {0,0,0,0};
        int[] nums = {-1,0,1,0};
        ThreeSum threeSum = new ThreeSum();
        List<List<Integer>> lists = threeSum.threeSum(nums);

        System.out.println(lists);
    }

}
