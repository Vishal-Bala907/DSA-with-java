package com.hackerrank.weekone;

import java.util.*;

public class BreakingRecords {

    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
        int min = scores.get(0);
        int max = scores.get(0);
        List<Integer> recordBreak = new ArrayList<>(List.of(0,0));

        for(Integer score : scores){
            if(score > max) {
                max = score;
                recordBreak.set(0,recordBreak.getFirst()+1);
            }
            if(score < min) {
                min = score;
                recordBreak.set(1,recordBreak.get(1)+1);
            }
        }

        return recordBreak;
    }

    public static void main(String[] args) {
//        int[] scores = {};
        List<Integer> integers = List.of(12, 24, 10, 24);
        System.out.println(breakingRecords(integers));
    }
}
