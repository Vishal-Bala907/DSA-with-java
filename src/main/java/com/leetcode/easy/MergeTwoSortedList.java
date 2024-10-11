package com.leetcode.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeTwoSortedList {
    private static List<Integer> mergeTwoSortedList(List<Integer> list1, List<Integer> list2) {
        List<Integer> myList = new ArrayList<>(list1);
        myList.addAll(list2);
        Collections.sort(myList);
        return myList;
    }
    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 2, 3);
        List<Integer> list2 = List.of(2, 3, 4, 5);
        List<Integer> list3 = mergeTwoSortedList(list1,list2);
        System.out.println(list3);
    }


}
