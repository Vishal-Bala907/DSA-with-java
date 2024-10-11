package com.leetcode.med;

import com.leetcode.easy.ClimbStairs;
import jdk.jshell.spi.SPIResolutionException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*Given a collection of numbers, nums, that might contain duplicates, return all possible unique permutations in any order.*/
public class Permutation2 {

    public static void findPermutation(List<String> mainList, String permutation, int[] arr,int len) {

        if(arr.length == 0 && permutation.length() == len) {
           mainList.add(permutation);
           return;
        }

        for(int i = 0; i < arr.length; i++) {

            String first = permutation + (arr[i]);
           // getting subArray
            int[] newArray = new int[arr.length - 1];
            // getting array elements
            int k = 0;
            for(int j = 0; j < arr.length ; j++ ) {
                if(j != i) {
                    newArray[k++] = arr[j];
                }
            }
            findPermutation(mainList, first, newArray, len);


        }
    }

    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<String> main = new ArrayList<>();
        findPermutation(main, "", nums, nums.length);
//        System.out.println(main);
        List<String> unique = new ArrayList<>();
        List<String> list = main.stream().filter((item1) -> {
            if (!(unique.contains(item1))) {
                unique.add(item1);
            }
            return false;
        }).toList();


        List<List<Integer>> myList = new ArrayList<>();

        int i = 0;
        for(String s : unique) {
            ArrayList<Integer> l = new ArrayList<>();
            for(int m = 0; m < s.length(); m++){
                l.add(Integer.valueOf(String.valueOf(s.charAt(m))));
            }
            myList.add(l);
            i++;
        }
        return myList;

    }


    public static void main(String[] args) {

        List<List<Integer>> lists = permuteUnique(new int[]{1, 1, 2});
        System.out.println(lists);

    }
}
