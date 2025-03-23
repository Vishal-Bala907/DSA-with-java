package org.dsa.java.recursion.second;

import java.util.ArrayList;
import java.util.List;

public class KeypadCombination {

    public static String[] keys = {"","abc","def","ghi","jkl","mno","pqrs","uvw","xyz"};

    // 23
    public static void printKeyPadCombination(String number, int arrCharIndex) {

        String firstStr = (keys[Integer.parseInt(String.valueOf(number.charAt(0)))]);
        String secondStr =  (keys[Integer.parseInt(String.valueOf(number.charAt(1)))]);
        if(firstStr.length() == arrCharIndex) {
            return;
        }
        String character = String.valueOf(firstStr.charAt(arrCharIndex));

        for(int i=0; i < secondStr.length(); i++) {
            System.out.println(character + secondStr.charAt(i));
        }
//
        printKeyPadCombination(number, arrCharIndex + 1);
    }

    public static List<String> printKeyPadCombination(String digits) {
        if(digits.isEmpty()) {
            return List.of("");
        }

        String firstStr = (keys[Integer.parseInt(String.valueOf(digits.charAt(0)))]);
        List<String> list = new ArrayList<>();

        if(digits.length() == 1) {
            for(int i = 0; i < firstStr.length(); i++) {
                list.add(String.valueOf(firstStr.charAt(i)));
            }

            return list;
        }

        String secondStr =  (keys[Integer.parseInt(String.valueOf(digits.charAt(1)))]);
        for(int i = 0; i < firstStr.length(); i++) {
            String str = "";
            for(int j = 0; j<secondStr.length(); j++) {
                list.add(String.valueOf(firstStr.charAt(i))+ String.valueOf(secondStr.charAt(j)));
            }
        }

        return list;
    }

    public static void main(String[] args) {
//        printKeyPadCombination("23",0);
        List<String> strings = printKeyPadCombination("23");
        List<String> strings2 = printKeyPadCombination("2");
        List<String> strings3 = printKeyPadCombination("");
        System.out.println(strings);
        System.out.println(strings2);
        System.out.println(strings3);
    }
}
