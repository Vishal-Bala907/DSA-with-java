package com.leetcode.hard;

// Definition for singly-linked list.


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeNSortedLinkedList {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =0; i < lists.length; i++) {
            ListNode lNode = lists[i];
            while(lNode != null) {
                list.add(lNode.val);
                lNode = lNode.next;
            }
        }
        Collections.sort(list);
        return createList(list , 0);
    }

    public static ListNode createList(List<Integer> values, int idx) {
        if(idx == values.size()) {
            return null;
        }
        return new ListNode(values.get(idx) , createList(values , idx + 1));
    }

    public static ListNode createList(int[] values, int idx) {
        if(idx == values.length) {
            return null;
        }
        return new ListNode(values[idx] , createList(values , idx + 1));
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val +" -> ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        final int[] first = {1,4,5};
        final int[] second = {1,3,4,5};
        final int[] third = {2,6};


        ListNode firstHead = createList(first ,0);
        ListNode secondtHead = createList(second ,0);
        ListNode thirdHead = createList(third ,0);

        ListNode[] nodes = new ListNode[3];
        nodes[0] = firstHead;
        nodes[1] = secondtHead;
        nodes[2] = thirdHead;

        ListNode listNode = mergeKLists(nodes);

//        printList(nodes[0]);
//        printList(nodes[1]);
//        printList(nodes[2]);
//        printList(secondtHead);
//        printList(thirdHead);
        printList(listNode);
    }
}
