package com.leetcode.med.string;

import java.util.ArrayList;

public class LongestSubString {
    public int recursiveApproach(int i, String og, String sub, int len) {
        if(i == og.length()) {
            return len;
        }
        if(sub.contains(String.valueOf(og.charAt(i)))) {
            // find the new substring
            int length = Math.max(sub.length(), len);
            char ch = og.charAt(i);
            int index = 0;
            for(int j = i-1; j >=0; j--) {
                if(ch == og.charAt(j)){
                    index = j;
                    break;
                }
            }
            return recursiveApproach(index + 1, og, "",length);

        }else{
            sub += String.valueOf(og.charAt(i));
            int length = Math.max(sub.length(), len);
            return recursiveApproach(i+1, og, sub,length);
        }

    }
    public int lengthOfLongestSubstring2(String s) {
        return recursiveApproach(0,s,"",0);
    }
    // PASSED
    public int lengthOfLongestSubstring(String s) {

//        ArrayList<String> subs = new ArrayList<>();
        int length = 0;
        String currentSubString = "";

        if(s.isEmpty()) {
            return 0;
        }
        if(s.length() == 1) {
            return 1;
        }

//        int length = 0;

        for(int i =0; i<s.length(); i++) {
            if(currentSubString.contains(String.valueOf(s.charAt(i)))) {
                // got a duplicate character
                length =  Math.max(currentSubString.length() , length);
                // if previous char is different
                int ch = s.charAt(i);
                for(int j = i-1; j>=0; j--){
                    if((ch != s.charAt(j))) {
                        i--;
                    }else{
                        i--;
                       break;
                    }
                }


                currentSubString = "";
            }else {
                currentSubString += String.valueOf(s.charAt(i));
                length =  Math.max(currentSubString.length() , length);
/*                System.out.println(currentSubString);
                System.out.println(length);*/
            }
        }

//        subs.add(currentSubString);

//        if(subs.size() < 2) {
//            length = subs.getFirst().length();
//        }
//
//        for(int i=0; i < subs.size() -1; i++) {
//            int len = 0;
//            if( subs.get(i).length() >= subs.get(i+1).length()) {
//                // i big
//                len = subs.get(i).length();
//            }else{
//                // i+2 big
//                len = subs.get(i+1).length();
//            }
//
//            if(len > length) {
//                length = len;
//            }
//
//        }


        return length;
    }
    public static void main(String[] args) {
        System.out.println(new LongestSubString().lengthOfLongestSubstring("abcabcbb"));
        System.out.println(new LongestSubString().lengthOfLongestSubstring(" "));
        System.out.println(new LongestSubString().lengthOfLongestSubstring("bbbbbb"));
        System.out.println(new LongestSubString().lengthOfLongestSubstring("pwwkew"));
        System.out.println(new LongestSubString().lengthOfLongestSubstring("aa"));
        System.out.println(new LongestSubString().lengthOfLongestSubstring("au"));
        System.out.println(new LongestSubString().lengthOfLongestSubstring("dvdf"));
        System.out.println(new LongestSubString().lengthOfLongestSubstring("anviaj"));


/*        System.out.println(new LongestSubString().lengthOfLongestSubstring2("abcabcbb"));
        System.out.println(new LongestSubString().lengthOfLongestSubstring2(" "));
        System.out.println(new LongestSubString().lengthOfLongestSubstring2("bbbbbb"));
        System.out.println(new LongestSubString().lengthOfLongestSubstring2("pwwkew"));
        System.out.println(new LongestSubString().lengthOfLongestSubstring2("aa"));
        System.out.println(new LongestSubString().lengthOfLongestSubstring2("au"));
        System.out.println(new LongestSubString().lengthOfLongestSubstring2("dvdf"));
        System.out.println(new LongestSubString().lengthOfLongestSubstring2("anviaj"));*/
    }
}
