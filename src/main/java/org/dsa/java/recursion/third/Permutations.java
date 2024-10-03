package org.dsa.java.recursion.third;

import java.util.Locale;

public class Permutations {
    // O(n*n!)
    public static void printPermutation(String str , String permutation ) {
        if(str.isEmpty()) {
            System.out.println(permutation);
            return;
        }

        for(int i=0; i<str.length(); i++) {
            char currChar = str.charAt(i);
            String newStr = str.substring(0,i) + str.substring(i+1);
            printPermutation(newStr , permutation + currChar);
        }
    }


    public static void main(String[] args) {
        printPermutation("ABC" , "");
    }
}
