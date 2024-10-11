package com.leetcode.med;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Permutation2SecondMethod {
    public static void findPermutation(List<List<Integer>> mainList, List<Integer> list ,  int[] arr) {

        if(arr.length == 0) {
            ArrayList<Integer> integers = new ArrayList<>(list);
//            if(!mainList.contains(integers)){
                mainList.add(integers);
//            }

            return;
        }

        for(int i = 0; i < arr.length; i++) {

            Integer first =  arr[i];
            list.add(first);
            // getting subArray
            int[] newArray = new int[arr.length - 1];
            // getting array elements
            int k = 0;
            for(int j = 0; j < arr.length ; j++ ) {
                if(j != i) {
                    newArray[k++] = arr[j];
                }
            }
            findPermutation(mainList, list , newArray);
            list.remove(first);
        }


    }

    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> mainList = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        findPermutation(mainList, list, nums);



        return mainList;
    }

    public static void main(String[] args) {

//        List<List<Integer>> lists = permuteUnique(new int[]{-1,2,-1,2,1,-1,2,1});
//        List<List<Integer>> lists = permuteUnique(new int[]{1,1,2});
        List<List<Integer>> lists = permuteUnique(new int[]{2,2,1,1});
        System.out.println(lists);

    }
}
