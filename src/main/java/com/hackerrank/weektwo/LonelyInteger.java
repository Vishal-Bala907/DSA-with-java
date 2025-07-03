package com.hackerrank.weektwo;

import java.util.ArrayList;
import java.util.List;

public class LonelyInteger {

    public static int lonelyinteger(List<Integer> a) {
        // Write your code here
        List<Integer> list = new ArrayList<>();
//        timecom: O(n^2)
//        list.contains(num) and list.remove(num) both take O(n) time in the worst case.
//        for(Integer num : a) {
//            if(list.contains(num)) {
//                list.remove(num);
//            } else {
//                list.add(num);
//            }
//        }

//        timecom: O(n)
        int unique = 0;
        for(int num : a) {
            unique = unique ^ num;
        }
        return unique;
    }


    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 1, 2);
        System.out.println(lonelyinteger(integers));
    }
}
