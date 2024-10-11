package com.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle {

    public List<Integer> getIdexList(int index) {
        ArrayList<Integer>[] list = new ArrayList[index  + 1];
        List<List<Integer>> myList = new ArrayList<>();


        for(int i=0; i <= index; i++) {
            list[i] = new ArrayList();
            if(i == 0) {
                list[i].add(0, 1);
                myList.add(list[i]);
            }
            else {
                list[i].add(0,1);
                for(int j = 1; j < i; j++ ) {
                    list[i].add(list[i-1].get(j-1) + list[i-1].get(j));
                }
                list[i].add(i,1);
                myList.add(list[i]);
            }

        }


        return list[index];
    }

    public List<List<Integer>> generate(int numRows) {
        ArrayList<Integer>[] list = new ArrayList[numRows];
        List<List<Integer>> myList = new ArrayList<>();


        for(int i=0; i < numRows; i++) {
            list[i] = new ArrayList();
            if(i == 0) {
                list[i].add(0, 1);
                myList.add(list[i]);
            }
            else {
                list[i].add(0,1);
                for(int j = 1; j < i; j++ ) {
                    list[i].add(list[i-1].get(j-1) + list[i-1].get(j));
                }
                list[i].add(i,1);
                myList.add(list[i]);
            }

        }

        return myList;
    }

    public static void main(String[] args) {
        PascalTriangle pascalTriangle = new PascalTriangle();
        List<List<Integer>> generate = pascalTriangle.generate(4);
        System.out.println(generate);

        System.out.println(pascalTriangle.getIdexList(3));
    }
}
