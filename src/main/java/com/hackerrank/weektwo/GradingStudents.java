package com.hackerrank.weektwo;

import java.util.ArrayList;
import java.util.List;

public class GradingStudents {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        List<Integer> list = new ArrayList<>();

        for(int grade: grades) {
            if(grade < 40) {
                list.add(grade);
            } else {
                int difference = ((grade - grade % 5) + 5) - grade;

                if(difference < 3) {
                    list.add((grade - grade % 5) + 5);
                } else {
                    list.add(grade);
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {

        List<Integer> integers = List.of(75,67,38,33);
//        List<Integer> integers = List.of(84, 29, 57, 3, 11,43);

        System.out.println(gradingStudents(integers));


    }
}
