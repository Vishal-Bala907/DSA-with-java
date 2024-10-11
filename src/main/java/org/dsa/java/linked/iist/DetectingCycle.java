package org.dsa.java.linked.iist;

public class DetectingCycle {

    public static void breakTheLoop(ReverseALinkedList.LinkedList meet , ReverseALinkedList.LinkedList head) {
        ReverseALinkedList.LinkedList h = head;
        while (meet.next != h.next) {
            meet = meet.next;
            h = h.next;
        }
        meet.next = null;
    }

    public static boolean hasCycle(ReverseALinkedList.LinkedList head) {

        if(head == null || head.next == null || head.next.next == null)
            return false;

//        ReverseALinkedList.LinkedList tempHead = head;
        ReverseALinkedList.LinkedList hare = head; // = head;
        ReverseALinkedList.LinkedList tortoise = head; //  = head.next.next;

        while (hare != null && hare.next != null) {
//            System.out.println(hare.data);
            tortoise = tortoise.next;
            hare = hare.next.next;
            if(hare == tortoise) {
                breakTheLoop(hare,head);
                return true;
                /*
                * Once the loop is detected (when the slow and fast pointers meet),
                *  keep one pointer at the meeting point and move the other pointer back to the head of the list.
                * Now, move both pointers one step at a time.
                * the point where they meet again is the start of the loop.
                *
                * */


            }
        }

        return false;


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

        ReverseALinkedList.LinkedList  node5 = new ReverseALinkedList.LinkedList("6");
        node4.next = node5;
        ReverseALinkedList.LinkedList  node6 = new ReverseALinkedList.LinkedList("7");
        node5.next = node6;

        ReverseALinkedList.LinkedList  node7 = new ReverseALinkedList.LinkedList("8");
        node6.next = node7;


        node7.next = node3;

//        node5.next = null;


        ReverseALinkedList reverseALinkedList = new ReverseALinkedList();
        boolean b = hasCycle(head);
        System.out.println(b);
        reverseALinkedList.printList(head);
//        boolean listPalindrome = isListPalindrome(head);
//        System.out.println(listPalindrome);
    }
}
