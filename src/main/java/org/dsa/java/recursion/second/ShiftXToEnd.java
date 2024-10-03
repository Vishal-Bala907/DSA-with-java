package org.dsa.java.recursion.second;

public class ShiftXToEnd {

    // O(n) n = original string length
    public static String shiftXToEnd(String original , int index , String nonx, String x) {

        if(original.length() == index) {
            return nonx + x;
        }

        if(String.valueOf(original.charAt(index)).equals("x")) {
          return  shiftXToEnd(original , index +1 , nonx , x + "x");
        } else {
          return  shiftXToEnd(original , index +1 , nonx + original.charAt(index) , x);
        }
    }

    public static void main(String[] args) {
        String s = "axbcxxd";
        String s1 = shiftXToEnd(s, 0, "", "");
        System.out.println(s1);
    }
}
