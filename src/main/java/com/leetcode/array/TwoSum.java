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

    public static String addTheNumbers(String num1, String num2) {

        // reversing first number
        String s = "";
        for(int i=num1.length()-1 ;i>=0; i--) {
            s += String.valueOf(num1.charAt(i));
        }
        String s1 = "";
        for(int i=num2.length()-1 ;i>=0; i--) {
            s1 += String.valueOf(num2.charAt(i));
        }

        String sum = String.valueOf(Integer.parseInt(s)+Integer.parseInt(s1));
        // reversing the number
        return sum;
    }

    public static void main(String[] args) {

//        int[] ints = twoSum(new int[]{2, 7, 11, 15}, 9);/**/
//        int[] ints = twoSum(new int[]{3,2,4}, 6);/
//        int[] ints = twoSum(new int[]{3,3}, 6);
//        int[] ints = twoSum(new int[]{3,2,3}, 6);
//        int[] ints = twoSum(new int[]{2,5,5,11}, 10);
//        int[] ints = twoSum(new int[]{2, 7, 11, 15}, 9);
//        System.out.println(ints[0]+" "+ints[1]);

        System.out.println(addTheNumbers("249","5649"));
//        System.out.println(addTheNumbers("9","1999999999"));
    }
}
