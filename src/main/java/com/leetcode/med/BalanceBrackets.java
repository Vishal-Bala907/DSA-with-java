package com.leetcode.med;

import java.util.Stack;

public class BalanceBrackets {
    public static void main(String[] args) {
            char[] s1 = "[]".toCharArray();
            Stack<Character> stack = new Stack<>();
            for(int i=0; i<s1.length; i++) {

                if(stack.isEmpty()) {
                    stack.push(s1[i]);
                }
                else if(s1[i] == ']') {
                    stack.pop();
                }
                else {
                    stack.push('[');
                }
            }


        System.out.println(stack.size()/2);
//        System.out.println(s);
//        System.out.println(swap);
    }
}
