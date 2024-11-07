package com.leetcode.med;

import java.util.regex.Pattern;

public class StringToInteger {
    public static int myAtoi(String s) {
        // leading white spaces ignored
        // leading +- would be the return type number + => +ive and - => -ive
        // any other non numerical digit appear then stop and return the number
        boolean isPositive = true;
        boolean typeFound = false;
        String number = "0";
        int num = -1;
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
//            System.out.println(ch);
            if(ch != ' ') {
                try {
                    boolean b = ch == '-' || ch == '+';
                    if(b && !typeFound ) {

                        if(num > -1) {
                            return 0;
                        }
                        if(ch=='-')
                            isPositive = false;
                        typeFound = true;
                    } else if(b && i == s.length() -1) {
                    }
                    else {
                        number += String.valueOf(Integer.parseInt(STR."\{ch}"));
                        num = Integer.parseInt(number);
                        typeFound = true;
                    }
                }catch (NumberFormatException ex) {
                    if(Double.parseDouble(number) > Integer.MAX_VALUE  ) {
                        return isPositive ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                    }
                    break;
                }
            }else {
                 if(num > -1 || typeFound)
                   break;
            }
        }

        return num == -1 ? 0 : isPositive ? num : -num;
    }

    public static void main(String[] args) {
        int i = myAtoi("999999111");
        System.out.println(i);
        System.out.println(myAtoi("42"));
        System.out.println(myAtoi("-042"));
        System.out.println(myAtoi("   -042"));
        System.out.println(myAtoi("1337c0d3"));
        System.out.println("ANS ::: "+myAtoi("0-1"));
        System.out.println(myAtoi("words and 987"));
        System.out.println(myAtoi("-91283472332"));
        System.out.println(myAtoi("+1"));
        System.out.println(myAtoi("+-12"));
        System.out.println(myAtoi("   +0 123"));
        System.out.println(myAtoi("123-"));
        System.out.println(myAtoi("  +  413"));

    }
}
