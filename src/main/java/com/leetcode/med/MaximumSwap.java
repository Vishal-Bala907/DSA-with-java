package com.leetcode.med;

import java.util.Arrays;

public class MaximumSwap {
    public static int maximumSwap(int num) {
        int li=0,si=0,sml=0,lg=0;
        String number = String.valueOf(num);
        int i = 0, j = number.length() - 1;

        while (i != j) {
            System.out.println(i+"\t"+j);

            if(Integer.parseInt(STR."\{number.charAt(i)}") >= Integer.parseInt(STR."\{number.charAt(j)}") ) {
//                i++;
                if(j > 0 && Integer.parseInt(STR."\{number.charAt(j-1)}") >= Integer.parseInt(STR."\{number.charAt(j)}")) {
//                    System.out.println(i+"\t"+j);

                    if(Integer.parseInt(STR."\{number.charAt(j)}") > lg) {
                        lg = Integer.parseInt(STR."\{number.charAt(j)}");
                        li = j;
                    }
                    // most important
                    if(si <= i) {
                        si = i;
                        sml = Integer.parseInt(STR."\{number.charAt(i)}");
                    }
                    j--;
                }
                else {
                    i++;
                }

            }else {
                // Jth > Ith
                // update the largest
                if(Integer.parseInt(STR."\{number.charAt(j)}") > lg) {
                    lg = Integer.parseInt(STR."\{number.charAt(j)}");
                    li = j;
                }
                // most important
                if(si <= i) {
                    si = i;
                    sml = Integer.parseInt(STR."\{number.charAt(i)}");
                }
                j--;
            }

        }

        // creating number
//        System.out.println(si+" "+li);
        char[] charArray = number.toCharArray();
            char temp = charArray[si];
            charArray[si] = charArray[li];
            charArray[li] = temp;
            StringBuilder numb = new StringBuilder();
            for(char c : charArray) {
                numb.append(c);
            }
            return Math.max(Integer.parseInt(numb.toString()),num);

    }

    public static void main(String[] args) {
//        System.out.println(maximumSwap(2763));
//        System.out.println(maximumSwap(97598));
//        System.out.println(maximumSwap(4185));
//        System.out.println(maximumSwap(57687));
//        System.out.println(maximumSwap(00));
//        System.out.println(maximumSwap(987415));
//        System.out.println(maximumSwap(879));
//        System.out.println(maximumSwap(98368));
//        System.out.println(maximumSwap(9973));
//        System.out.println(maximumSwap(120));
//        System.out.println(maximumSwap(19931105));
        System.out.println(maximumSwap(99808));
        System.out.println(maximumSwap(21));
        System.out.println(maximumSwap(8998778));


    }
}
