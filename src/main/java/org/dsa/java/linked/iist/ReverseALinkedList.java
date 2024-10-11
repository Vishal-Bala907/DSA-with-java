package org.dsa.java.linked.iist;

public class ReverseALinkedList {
     static class LinkedList {
        public String data;
        public LinkedList next;

        public LinkedList(String data) {
            this.data = data;
            this.next = null;

        }
    }

    static  LinkedList head;

    public LinkedList getHead() {
        return head;
    }

    public ReverseALinkedList setHead(LinkedList head) {
        ReverseALinkedList.head = head;
        return this;
    }


    public void reverseListItr() {

        if(head == null || head.next == null) {
            return;
        }
        LinkedList prev = head;
        LinkedList current = head.next;
        LinkedList forward = current.next;

        while (forward != null) {
            current.next = prev;
            prev = current;
            current = forward;
            forward = forward.next;
        }

        head.next = null;
        current.next = prev;
        head = current;
    }

    public static LinkedList reverseListRecursive(LinkedList headNode ) {

        if(headNode == null || headNode.next == null) {
            return headNode;
        }
        LinkedList newHead = reverseListRecursive(headNode.next);

        headNode.next.next = headNode;
        headNode.next = null;

        return newHead;

    }

    public void printList(LinkedList head) {
      LinkedList  temp = head;
        while(temp != null) {
            System.out.print(temp.data+" => ");
            temp = temp.next;
        }

    }

    public static void main(String[] args) {
        ReverseALinkedList reverseALinkedList  = new ReverseALinkedList();
        LinkedList head = new LinkedList("0");
        reverseALinkedList.head = head;
        LinkedList node1 = new LinkedList("1");
        head.next =node1;
        LinkedList node2 = new LinkedList("2");
        node1.next = node2;
        LinkedList node3 = new LinkedList("3");
        node2.next=node3;
        LinkedList node4 = new LinkedList("4");
        node3.next = node4;
        node4.next = null;

        LinkedList temp = head;

        head = reverseListRecursive(head); // retrieved last node
//        head.next = null;
//        Mydeo mydeo = new Mydeo();

        temp = head;
       while(temp != null) {
           System.out.print(temp.data+" => ");
           temp = temp.next;
       }


    }
}
