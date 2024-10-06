package com.leetcode;

public class ListNode {
    int val;
    ListNode next;

    // Default constructor
    ListNode() {}

    // Constructor to initialize the node with a value
    ListNode(int val) {
        this.val = val;
    }

    // Constructor to initialize the node with a value and the next node reference
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int borrow = 0;
        ListNode prev = null;
        ListNode lst = null;
        int sum = 0;
        while(l1 != null && l2 != null) {
            sum = l1.val + l2.val + borrow;
            if(sum > 9) {
                borrow = sum/10;
                sum = sum % 10;
            } else {
                borrow = 0;
            }
            // Add to the list
            if(prev == null) {
                lst = new ListNode(sum);
                prev = lst;
            }else{
                ListNode node = new ListNode(sum );
                prev = node;
            }

            l1 = l1.next;
            l2 = l2.next;
        }
        // l1 != null
        while(l1 != null) {
            sum += l1.val;
            if(sum > 9) {
                borrow = sum/10;
                sum = sum % 10;
            } else {
                borrow = 0;
            }
            ListNode node = new ListNode(sum , prev);
            prev = node;
            l1 = l1.next;
        }

        // l1 != null
        while(l2 != null) {
            sum += l2.val;
            if(sum > 9) {
                borrow = sum/10;
                sum = sum % 10;
            } else {
                borrow = 0;
            }
            ListNode node = new ListNode(sum , prev);
            prev = node;
            l2 = l2.next;
        }

        if(borrow > 0 ) {
            ListNode node = new ListNode(borrow , prev);
            prev = node;
        }

        return lst;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode();
    }

}