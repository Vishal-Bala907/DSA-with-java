package org.dsa.java.linked.iist;

public class DeleteNthNodeFromLast {

    public void deleteNthNodeFromLast() {
        new ReverseALinkedList().printList(ReverseALinkedList.head);
        int size;
    }





    public static void main(String[] args) {
        ReverseALinkedList.LinkedList  head = new ReverseALinkedList.LinkedList("1");
//        ReverseALinkedList reverseALinkedList = new ReverseALinkedList();
        ReverseALinkedList.head = head;

        ReverseALinkedList.LinkedList  node1 = new ReverseALinkedList.LinkedList("2");
        head.next = node1;

        ReverseALinkedList.LinkedList  node2 = new ReverseALinkedList.LinkedList("3");
        node1.next = node2;

        ReverseALinkedList.LinkedList  node3 = new ReverseALinkedList.LinkedList("4");
        node2.next = node3;

        ReverseALinkedList.LinkedList  node4 = new ReverseALinkedList.LinkedList("5");
        node3.next = node4;
        node4.next = null;

        new ReverseALinkedList().printList(ReverseALinkedList.head);

    }

}
