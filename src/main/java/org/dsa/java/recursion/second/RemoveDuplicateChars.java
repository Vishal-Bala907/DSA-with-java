package org.dsa.java.recursion.second;

public class RemoveDuplicateChars {
    public static boolean[] alphabets = new boolean[26];

    public static void removeDuplicateChars(String str , int index , String newstr) {

        if(str.length() == index ) {
            System.out.println(newstr);
            return;
        }

        if(!alphabets[str.charAt(index) - 'a']) {
            alphabets[str.charAt(index) - 'a'] = true;
            newstr += str.charAt(index);
            removeDuplicateChars(str , index +1 , newstr);
        } else {
            removeDuplicateChars(str , index + 1 , newstr);
        }
    }


    public static void main(String[] args) {
        String s = "vishalbalaisthegoat";
        removeDuplicateChars(s,0,"");
    }
}
