package com.leetcode.med;

import java.lang.reflect.Array;
import java.util.Arrays;

// 11
public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        if(height.length == 1) {
            return 0;
        }
        // find the largest number
        // TLE
/*        int MAX_VOL = 0;
        int containersCount = height.length - 1;

        for(int i = 0, j = height.length; i<height.length; i++) {
                int water = Math.min(height[i],height[containersCount]) * (containersCount - i);
                MAX_VOL = Math.max(water, MAX_VOL);
        }

        return MAX_VOL;*/

        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            maxArea = Math.max(maxArea, (right - left) * Math.min(height[left], height[right]));

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
        System.out.println(maxArea(new int[]{1,1}));
        System.out.println(maxArea(new int[]{1,8,6,2,5}));

        System.out.println(maxArea(new int[]{1,2,1}));
        System.out.println(maxArea(new int[]{1,2}));
        System.out.println(maxArea(new int[]{1,2,4,3}));
        System.out.println(maxArea(new int[]{8,7,2,1}));


        System.out.println(maxArea(new int[]{6,4,3,1,4,6,99,62,1,2,6}));
    }
}
