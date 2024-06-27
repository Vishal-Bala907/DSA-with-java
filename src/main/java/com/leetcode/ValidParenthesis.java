package com.leetcode;
/*
* Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.


Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false*/

import java.util.ArrayList;
import java.util.List;

class ValidateParenthesis{
    public boolean isValid(String s) {
        String[] chars = s.split("");
        List<String> bracks = new ArrayList<>(List.of(chars));
        for(int i = 0; i < bracks.size(); ){
            System.out.println(i);
            int k =0;
            for(int j = 1; j <  bracks.size(); j++){
                if( (bracks.get(j).equals("(")  && (bracks.get(j+1).equals("}") || bracks.get(j+1).equals("]")))
                    || (bracks.get(j).equals("{")  && (bracks.get(j+1).equals(")") || bracks.get(j+1).equals("]")))
                        || (bracks.get(j).equals("[")  && (bracks.get(j+1).equals("}") || bracks.get(j+1).equals(")")))
                ){
                    return false;
                }
                if((bracks.get(k).equals("(") && bracks.get(j).equals(")"))) {
                    System.out.println(bracks.get(k)+" = "+bracks.get(j));
                    bracks.remove(j);
                    bracks.remove(k);
                    break;
                }
               else if(bracks.get(k).equals("{") && bracks.get(j).equals("}")) {
                    System.out.println(bracks.get(k)+" = "+bracks.get(j));
                    bracks.remove(j);
                    bracks.remove(k);
                   break;
                }
               else if(bracks.get(k).equals("[") && bracks.get(j).equals("]")){
                    System.out.println(bracks.get(k)+" = "+bracks.get(j));
                    bracks.remove(j);
                    bracks.remove(k);
                    break;
                }
            }
        }
        return bracks.isEmpty();
    }
}
public class ValidParenthesis {
    public static void main(String[] args) {

        ValidateParenthesis v = new ValidateParenthesis();
        System.out.println(v.isValid("([)]"));
    }
}
