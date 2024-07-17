package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class LeetCodePlusOne{
    public static int[] plusOne(int[] digits) {
        int carry = 1;
        boolean plusOne = true,allNine = true;
        for(int i = digits.length - 1; i >= 0; i--){
            if(digits[i] == 9 && carry == 1){
                digits[i] = 0;
            }else{
                digits[i] = plusOne ? ++digits[i] : digits[i];
                carry = 0;
                plusOne = false;
                allNine = false;
            }
        }

        if(allNine){
            int[] newArr = new int[digits.length + 1];
            for(int i=0;i<digits.length;i++){
                newArr[i+1] = digits[i];
            }
            newArr[0] = 1;
            return newArr;
        }else{
            return digits;
        }
    }
}

class RemoveSpecific{
    public static int removeElement(int[] nums, int val) {

        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                System.out.println(nums[i]+" !=  "+val);
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}

public class RemoveSpecificElement {
    public static void main(String[] args) {
//        int[] nums = new int[] {3,2,2,3};
//        int num = RemoveSpecific.removeElement(nums, 3);
//        System.out.println(num);
//        for(int n:nums){
//            System.out.print(n+" ");
//        }

        String arr = "  vishal bal    is great        "; //split(" ")[];
//        System.out.println(arr.split(" ")[arr.split(" ").length-1].length());

            int[] digits = {9,9,9,9,9,9,9,9};


//
//            for(int i=0;i<newArr.length;i++){
//                System.out.print(newArr[i]+" , ");
//            }




    }
}
