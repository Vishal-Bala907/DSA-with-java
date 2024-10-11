package org.dsa.java.stack;

import java.util.ArrayList;

public class StackDSArrayList {
    static class Stack<T>{
       ArrayList<T> stack = new ArrayList<T>();

        public boolean isEmpty() {
            return stack.isEmpty();
        }

        public void push(T data) {
            stack.add(data);
        }

        public T pop() {
          return isEmpty() ? null : stack.removeLast();
        }

        public T peek() {
            return isEmpty() ? null : stack.removeLast();
        }
    }

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack.stack);

        System.out.println(stack.pop());
        System.out.println(stack.stack);
// STRING
        Stack<String> stack2 = new Stack<>();
        stack2.push("A");
        stack2.push("B");
        stack2.push("C");
        stack2.push("D");
        stack2.push("E");

        System.out.println(stack2.stack);

        System.out.println(stack2.pop());
        System.out.println(stack2.stack);
    }
}
