package com.hackerrank.weekone;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MinAndMax {

    static class Result {
        public static void miniMaxSum(List<Integer> arr) {
            // Write your code here
//            System.out.println(arr);
            long min = Long.MAX_VALUE, max = 0 , sum = 0;

            for(int i : arr) {
                sum += i;
                if(i < min) {
                    min = i;
                }
                if(i > max) {
                    max = i;
                }
            }

            System.out.print((sum-max) + " " + (sum - min));

        }


    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(List.of(1, 3, 5, 7, 9));
        Result.miniMaxSum(arr);



    }
}
