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
        // SOLVED
        String[] chars = s.split("");
        List<String> bracks = new ArrayList<>(List.of(chars));

        if(chars.length % 2 != 0)
            return false;

        for(int i = 0; i <= bracks.size(); i++) {

            for(int j=0; j < bracks.size()-1; j++ ) {

                String first = bracks.get(j);
                String second = bracks.get(j+1);

                if((first.equals("(") && second.equals(")")) ||
                   (first.equals("{") && second.equals("}")) ||
                   (first.equals("[") && second.equals("]"))
                ){
                    bracks.remove(j);
                    bracks.remove(j);
                    i = 0;
                    break;
                }else if(
                        (first.equals("(") && (second.equals("}") || second.equals("]")) ) ||
                        (first.equals("{") && (second.equals("]") || second.equals(")")) ) ||
                        (first.equals("[") && (second.equals("}") || second.equals(")")) )
                ){
                    return false;
                }
            }
        }
        return bracks.isEmpty();
    }
}
public class ValidParenthesis {
    public static void main(String[] args) {

        ValidateParenthesis v = new ValidateParenthesis();
        System.out.println("false "+v.isValid("([[])]"));
        System.out.println("false "+v.isValid("([[])]"));
        System.out.println("true "+v.isValid("([[]]){}"));

        System.out.println("false "+v.isValid("{{([[]]){}"));
        System.out.println("false "+v.isValid("{{"));
        System.out.println("false "+v.isValid("[{}(}])"));
        System.out.println("false "+v.isValid("{{{}}}{}{}{{]"));
        System.out.println("false "+v.isValid("[[]]({{})()}"));

        System.out.println("false "+v.isValid("{}{}{{))))"));
        System.out.println("false "+v.isValid("[][]({})]"));
        
        System.out.println("true "+v.isValid("[{}](){}[]()"));
        System.out.println("true "+v.isValid("{{{}}}{}{}{{[]}}"));
        System.out.println("true "+v.isValid("[[]]({{}})(){}"));

        System.out.println("true "+v.isValid("{}{}{{(())}}(())"));
        System.out.println("true "+v.isValid("[][]({})[]"));


    }
}
