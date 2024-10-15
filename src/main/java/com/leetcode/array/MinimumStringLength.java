package com.leetcode.array;

public class MinimumStringLength {
//Minimum String Length After Removing Substrings
    public static void main(String[] args) {
        String s = "ABFCACDB";
        while(s.contains("AB") || s.contains("CD")){
//          if(s.contains("AB")) {
              s  = s.replace("AB", "");
//          } else {
              s  = s.replace("CD", "");
//          }
        }
        System.out.println(s.length());
    }
}
