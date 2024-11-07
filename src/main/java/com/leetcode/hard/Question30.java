package com.leetcode.hard;

import java.util.*;

/*
* TIME LIMIT EXCEEDED
* */
public class Question30 {

    public static void findPermutation(String[] arr, List<String> perms, String per) {
        if(arr.length == 0) {
            perms.add(per);
        }

        for(int i=0; i<arr.length; i++ ) {
            String first = arr[i];
            String[] copy = new String[arr.length - 1];
            int k = 0;
            for(int j = 0; j < arr.length; j++ ) {
                if( j != i ) {
                    copy[k++] = arr[j];
                }
            }
            findPermutation(copy, perms,per+first);
        }


    }
    public static List<Integer> findSubstring(String s, String[] words) {
        int str = s.length();
        int subStr = words[0].length();
        List<Integer> indices = new ArrayList<>();
        List<String> string; // = new ArrayList<>();
        int i = 0;
        List<String> list =  Arrays.asList(words);
        Collections.sort(list);
        while(i + subStr*words.length <= str) {
            string = new ArrayList<>();
            String SUBSTRING = s.substring(i, i+subStr*words.length);
            for(int j =0; j <= SUBSTRING.length() - subStr;) {
                String substring = SUBSTRING.substring(j, j + subStr);
                j += subStr;
                string.add(substring);
            }

            Collections.sort(string);
            boolean flag = true;
            for(int l=0; l < string.size(); l++ ) {
                if(!list.get(l).equals(string.get(l))) {
                    flag = false;
                }
            }
            if(flag) {
                indices.add(i);
            }
            i++;
        }

        return indices;
    }

//    public static List<Integer> findSubstring(String s, String[] words) {
//        /*
//         * TIME LIMIT EXCEEDED
//         * */
//        int str = s.length();
//        int subStr = words[0].length();
//        List<Integer> list2 = new ArrayList<>();
//        List<String> permutations = new ArrayList<>();
//        findPermutation(words,permutations,"");
//        int i = 0;
//        while(i+subStr*words.length <= str) {
//            String SUBSTRING = s.substring(i, i+subStr*words.length);
//            if(permutations.contains(SUBSTRING)) {
//                    list2.add(i);
//            }
//                i = i + 1;
//        }
//        return list2;
//    }

    public static void main(String[] args) {

        System.out.println(findSubstring("barfoothefoobarman", new String[]{"foo","bar"}));
        System.out.println(findSubstring("wordgoodgoodgoodbestword", new String[]{"word","good","best","word"}));
        System.out.println(findSubstring("barfoofoobarthefoobarman", new String[]{"bar","foo","the"}));
        System.out.println(findSubstring("wordgoodgoodgoodbestword", new String[]{"word","good","best","good"}));
        System.out.println(findSubstring("lingmindraboofooowingdingbarrwingmonkeypoundcake", new String[]{"fooo","barr","wing","ding","wing"}));
    }
}
