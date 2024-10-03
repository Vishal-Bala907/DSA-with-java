package org.dsa.java.recursion.second;

// Time complexity = O(n) where n = length of string
public class ReverseString {
    public static void printReverse(String str, int length) {

        if(length == 1) {
            System.out.print(str.charAt(length - 1));
            return;
        }

        System.out.print(str.charAt(length - 1));
        printReverse(str , length -1);
    }

    public static void main(String[] args) {
        String str = "abcd";
        printReverse(str , str.length());
    }
}
