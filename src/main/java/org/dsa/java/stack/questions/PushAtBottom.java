package org.dsa.java.stack.questions;

import java.util.Stack;

public class PushAtBottom {

    public static void placeInLast(Stack<Integer> s , int element) {

        if(s.isEmpty()) {
            s.push(element);
            return;
        }

        int p = s.pop();
        placeInLast(s,element);
        s.push(p);


    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(0);
        s.push(1);
        s.push(2);

        System.out.println(s);

        placeInLast(s,3);

        System.out.println(s);
    }

}
