package com.leetcode.easy;

import java.util.regex.Pattern;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "race a car";
        String s1 = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        String  builder = (new StringBuilder(s1).reverse().toString());
        System.out.println(builder);
        for(int i = s1.length() - 1,  j = 0; i >= 0 ; i--,j++) {
            System.out.println(s1.charAt(i)+" = "+builder.charAt(j));
        }

//        System.out.println(builder.equals(s1));
    }
}
