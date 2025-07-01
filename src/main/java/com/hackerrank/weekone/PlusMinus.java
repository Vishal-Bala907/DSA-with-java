package com.hackerrank.weekone;

/*
*
* https://www.hackerrank.com/challenges/three-month-preparation-kit-plus-minus/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=three-month-preparation-kit&playlist_slugs%5B%5D=three-month-week-one
*
* */

import java.util.List;

public class PlusMinus {
    static class Result {
        public static void plusMinus(List<Integer> arr) {
            // Write your code here
            int size = arr.size();
            double[] ratio = {0.0d,0.0d,0.0d};

            arr.forEach(item->{
               if(item > 0) {
                   ratio[0] = ratio[0] + 1;
               } else if(item == 0) {
                   ratio[2] = ratio[2] + 1;
               } else {
                   ratio[1] = ratio[1] + 1;
               }
            });


            System.out.println(ratio[0] / size);
            System.out.println(ratio[1] / size);
            System.out.println(ratio[2] / size);
        }

    }

    public static void main(String[] args) {

        List<Integer> integers = List.of(1, 1, 0, -1, -1);
        Result.plusMinus(integers);

    }
}
