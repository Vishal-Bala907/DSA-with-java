package org.dsa.java.recursion.second;

public class KeypadCombination {

    public static String[] keys = {".","abc","def","ghi","jkl","mno","pqrs","uvw","xyz"};

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

    public static void main(String[] args) {
        printKeyPadCombination("23",0);
    }
}
