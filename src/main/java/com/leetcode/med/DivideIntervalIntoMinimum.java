package com.leetcode.med;

import java.util.ArrayList;

public class DivideIntervalIntoMinimum {
    public static int minGroups(int[][] intervals) {
        int group = 1;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < intervals.length - 1; i++) {
            //? checking if the preceding sub array has any intersection ?
            if(!list.contains((Integer)i)) {


                if (intervals[i][0] == intervals[i + 1][0] || intervals[i][1] == intervals[i + 1][1] || intervals[i][1] == intervals[i + 1][0] || intervals[i][1] == intervals[i + 1][1]
                ) {
                    System.out.println("hello");
                    // found intersection now go to the point where you first find it
                    list.add(i);
                    for (int j = i; j > 0; j--) {
                        if (intervals[j][0] == intervals[j + 1][0] || intervals[j][0] == intervals[j + 1][1] || intervals[j][1] == intervals[j + 1][0] || intervals[j][1] == intervals[j + 1][1]) {
                            group++;
                            list.add(j);
                            i = 0;
                        }
                    }
                }
            }
        }

        return group;
    }
    public static void main(String[] args) {
        int[][] interval = {{5,10},{6,8},{1,5},{2,3},{1,10}};

        int i = minGroups(interval);
        System.out.println(i);
    }
}
