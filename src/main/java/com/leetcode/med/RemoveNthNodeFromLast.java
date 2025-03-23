package com.leetcode.med;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

// 19th
public class RemoveNthNodeFromLast {
    public class ListNode {
        public int val;
        public ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    static class NodeDelete {
        static int pos = 0;
        static ListNode node;
        static boolean found;
    }

    public ListNode createList(int[] values, int idx) {
        if(idx == values.length) {
            return null;
        }
        return new ListNode(values[idx] , createList(values , idx + 1));
    }

    public void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val +" -> ");
            head = head.next;
        }
        System.out.println("\n\n\n");
    }

    

    public void deleteNode(ListNode node, int nodeNum) {

    }

    public static void main(String[] args) {
        int[] arr = {1};

        RemoveNthNodeFromLast removeNthNodeFromLast = new RemoveNthNodeFromLast();
        ListNode list =  removeNthNodeFromLast.createList(arr, 0);
        removeNthNodeFromLast.printList(list);

        removeNthNodeFromLast.deleteNode(list , 1);
        removeNthNodeFromLast.printList(list);
//
//        printList(list);



    }
}
