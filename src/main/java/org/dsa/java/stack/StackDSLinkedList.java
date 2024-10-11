package org.dsa.java.stack;

public class StackDSLinkedList {
    public static class Node {
        int data;
        Node next;
        public Node(int data) {this.data = data; next = null;}
    }

    public static class Stack {
        public static Node head;

        public static boolean isEmpty() {
            return head == null;
        }

        public static void push(int data) {
                if(isEmpty()) {
                    // if node = null then node->null
                    head = new Node(data);
                    return;
                }else {
                    // newNode -> prevHead -> ... -> null
                    // head = newNode
                    Node node = new Node(data);
                    node.next = head;
                    head = node;
                }
        }

        public static int pop() {
            if(isEmpty()) {
                return -1;
            } else {
                // head -> node -> ... -> null
                int oldHead = head.data;
                head = head.next;
                return oldHead;
            }
        }

        public static int peek() {
            if(isEmpty()) {
                return -1;
            } else {
                // head -> node -> ... -> null
                return head.data;
            }
        }

        public static void printStack() {
            Node n = head;
            while (n != null) {
                System.out.print(n.data+" , ");
                n = n.next;
            }
        }
    }

    public static void main(String[] args) {
       Stack.push(1);
       Stack.push(2);
       Stack.push(3);
       Stack.push(4);
       Stack.push(5);

       Stack.printStack();


      System.out.println("\nElement popped : "+ Stack.pop());
      System.out.println();

      Stack.printStack();

      System.out.println("\nPeek() "+Stack.peek());

    }
}
