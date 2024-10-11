package org.dsa.java.stack.questions;

import java.util.Stack;

public class ReverseAStack {
    public static void placeInLast(Stack<Integer> s , int element) {

        if(s.isEmpty()) {
            s.push(element);
            return;
        }

        int p = s.pop();
        placeInLast(s,element);
        s.push(p);


    }
    public static void reverseStack(Stack<Integer> s,int e) {

        if(s.isEmpty()) {
            return;
        }
        Integer pop = s.pop();
        reverseStack(s,pop);
        placeInLast(s,pop);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(0);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        System.out.println(s);

        reverseStack(s,0);

        System.out.println(s);
    }
}
