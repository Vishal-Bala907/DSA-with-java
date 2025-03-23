package com.leetcode.med;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntegerIntoRoman {
    public static String intToRoman(int num) {
        final String NUMBER = String.valueOf(num);
        String str = "";

        for(int i =0; i<NUMBER.length(); i++) {
            int number = Integer.parseInt(String.valueOf(NUMBER.charAt(i)));
            int size = NUMBER.length() - i;
            if(size == 1) {
                System.out.println(number);
                if(number <= 3) {
                    for(int n = 1; n<= number ; n++) {
                        str += "I";
                    }
                } else if(number == 4) {
                    str += "IV";
                } else if(number == 5) {
                    str += "V";
                } else if(number < 9) {
                    int modVal = number % 5;
                    str += "V";
                    for(int n = 1; n <= modVal ; n++) {
                        str += "I";
                    }
                } else if(number == 9) {
                    str += "IX";
                }
//                else if(number >= 4 && number <= )
            } else if(size == 2) {
                if(number <= 3) {
                    for(int n = 1; n<= number ; n++) {
                        str += "X";
                    }
                } else if(number == 4) {
                    str += "XL";
                } else if(number == 5) {
                    str += "L";
                } else if(number < 9) {
                    int modVal = number % 5;
                    str += "L";
                    for(int n = 1; n <= modVal ; n++) {
                        str += "X";
                    }
                }
                else if(number == 9) {
                    str += "XC";
                }
            } else if(size == 3) {
                if(number <= 3) {
                    for(int n = 1; n<= number ; n++) {
                        str += "C";
                    }
                } else if(number == 4) {
                    str += "CD";
                } else if(number == 5) {
                    str += "D";
                } else if(number < 9) {
                    int modVal = number % 5;
                    str += "D";
                    for(int n = 1; n <= modVal ; n++) {
                        str += "C";
                    }
                }else if(number == 9) {
                    str += "CM";
                }
            } else if(size == 4) {
                if(number <= 3) {
                    int modVal = number % 5;
                    for(int n = 1; n<= modVal ; n++) {
                        str += "M";
                    }
                }
            }
        }

       return str;
    }
    public static void main(String[] args) {
//        intToRoman(3000);
//        System.out.println(intToRoman(10));
//        System.out.println(intToRoman(20));
//        System.out.println(intToRoman(30));
//        System.out.println(intToRoman(40));
//        System.out.println(intToRoman(50));
//        System.out.println(intToRoman(60));
//        System.out.println(intToRoman(70));
//        System.out.println(intToRoman(80));
//        System.out.println(intToRoman(34));
//        System.out.println(intToRoman(54));
//        System.out.println(intToRoman(76));


//        System.out.println(intToRoman(340));
//        System.out.println(intToRoman(546));
//        System.out.println(intToRoman(763));
        System.out.println(intToRoman(3749));
        System.out.println(intToRoman(58));
        System.out.println(intToRoman(1994));
    }
}
