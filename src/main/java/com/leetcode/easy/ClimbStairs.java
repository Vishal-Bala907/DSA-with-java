package com.leetcode.easy;

public class ClimbStairs {

    public static int climbStairs(int n) {

        if(n < 0) {
            return 0;
        } else if(n == 0 ) {
            return 1;
        }
        return climbStairs(n-1) + climbStairs(n-2);
    }
    public static void main(String[] args) {
        int climbedStairs = climbStairs(44);
        System.out.println(climbedStairs);
    }
}
