package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int romanToInt(String s) {

        int sum = 0,j = 0,i=0;
        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<Character,Integer>();

        for(char c : "IVXLCDM".toCharArray()){
            Integer[] value = {1,5,10,50,100,500,1000};
            map.put(c,value[j]);
            j++;
        }

        for(i=0; i<chars.length-1; i++){

            if( map.get(chars[i]) > map.get(chars[i + 1]) || map.get(chars[i]).equals(map.get(chars[i+1]))){
                sum +=  map.get(chars[i]);
            }else{
                sum +=  map.get(chars[i+1])- map.get(chars[i]);
                i++;
            }
        }
        if(i!=chars.length){
            sum +=  map.get(chars[i]);
        }

        return sum;
    }
}

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(new Solution().romanToInt("III"));
    }
}
