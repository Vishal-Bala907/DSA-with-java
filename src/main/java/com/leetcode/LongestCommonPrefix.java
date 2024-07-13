package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
* Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".



Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
*
*
* */

class SolutionTwo {
    public String longestCommonPrefix(String[] strs) {

        String globalStr="";
        if(strs.length == 1)
            return strs[0];
        for(int i=0; i <= strs.length - 2 ; i++ ){
                char[] first = strs[i].toCharArray();
                char[] second = strs[i+1].toCharArray();
            //"aac","acab","aa","abba","aa"
                 String local="";
                for(int j=0 ; j<first.length && j<second.length ; j++){

                    if(i==0 && (first[j]==second[j])){
                        local += first[j];
                        globalStr =local;
                    }else if(first[j]==second[j]){

                        local += first[j];
                    }
                    else{
                        break;
                    }
                }
                // comparing local and global
//            System.out.println("local: "+local);
            char[] l = local.toCharArray();
            char[] g = globalStr.toCharArray();
            String temp ="";
            boolean isMactched = false;
            for(int p=0; p <= l.length - 1  && p <= g.length-1 ; p++ ){

                if(first[p]==second[p]){
                    isMactched = true;
                    temp += first[p];
                    globalStr =temp;
                }else{
                    break;
                }
            }
            if(!isMactched){
                return "";
            }

        }




        return globalStr;
    }
}

public class LongestCommonPrefix {
    public static void main(String[] args) {
//        String str =  ;
//        String str =  new SolutionTwo().longestCommonPrefix(new String[]{"flower","flow","flight"});
        System.out.println(new SolutionTwo().longestCommonPrefix(new String[]{"flower","fkow"}));
        System.out.println(new SolutionTwo().longestCommonPrefix(new String[]{"flower","flow","flight"}));
        System.out.println(new SolutionTwo().longestCommonPrefix(new String[]{"cat","cir"}));
        System.out.println(new SolutionTwo().longestCommonPrefix(new String[]{"ab","a"}));
        System.out.println(new SolutionTwo().longestCommonPrefix(new String[]{"aa","aa"}));
        System.out.println(new SolutionTwo().longestCommonPrefix(new String[]{"aa","ab"}));
        System.out.println(new SolutionTwo().longestCommonPrefix(new String[]{"aaa","aabc","asvs"}));
        System.out.println(new SolutionTwo().longestCommonPrefix(new String[]{"a"}));
        System.out.println("e : "+new SolutionTwo().longestCommonPrefix(new String[]{"ca","c","bba","bacb","bcb"}));
        System.out.println("e : "+new SolutionTwo().longestCommonPrefix(new String[]{"reflower","flow","flight"}));
        System.out.println("e : "+new SolutionTwo().longestCommonPrefix(new String[]{"baab","bacb","b","cbc"}));
        System.out.println("e : "+new SolutionTwo().longestCommonPrefix(new String[]{"ca","c","bba","bacb","bcb"}));
        System.out.println("a : "+new SolutionTwo().longestCommonPrefix(new String[]{"acc","aaa","aaba"}));
        System.out.println("a : "+new SolutionTwo().longestCommonPrefix(new String[]{"aac","acab","aa","abba","aa"}));
    }
}
