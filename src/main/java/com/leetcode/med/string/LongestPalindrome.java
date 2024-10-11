package com.leetcode.med.string;

public class LongestPalindrome {
// 172
//ms
//Beats
//32.73%
    public String longestPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        int l = left;
        int r = right;
        int c = 1;

        if(s.length() == 1) {
            return s;
        }

        while(left <= (l+r)/2 ) {
            if (s.charAt(left) == s.charAt(right)) {
                if(l+1 == r) {
                    break;
                }
                left++;
                right--;
            } else if (r == s.length() - 1) {
                if(l == s.length() -2) {
                    return String.valueOf(s.charAt(0));
                }else{
                    l = 0;
                    left = 0;
                    r =  r - c++;
                    right = r;
                }

            } else {
                right = ++r;
                left = ++l;
            }
        }


        return s.substring(l,r+1);
    }

    public static void main(String[] args) {
        LongestPalindrome palindrome = new LongestPalindrome();
        System.out.println(palindrome.longestPalindrome("ababd"));
        System.out.println(palindrome.longestPalindrome("ababa"));
        System.out.println(palindrome.longestPalindrome("vishal"));
        System.out.println(palindrome.longestPalindrome("bb"));
        System.out.println(palindrome.longestPalindrome("babad"));
        System.out.println(palindrome.longestPalindrome("cbbd"));
        System.out.println(palindrome.longestPalindrome("ac"));
        System.out.println(palindrome.longestPalindrome("abb"));
    }

}
