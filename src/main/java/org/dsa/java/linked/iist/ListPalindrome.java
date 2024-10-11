package org.dsa.java.linked.iist;

public class ListPalindrome {

    public static ReverseALinkedList.LinkedList reverse(ReverseALinkedList.LinkedList head) {
        if(head == null || head.next == null) {
            return head;
        }
        ReverseALinkedList.LinkedList prev = head;
        ReverseALinkedList.LinkedList current = head.next;
        ReverseALinkedList.LinkedList forward = current.next;
//        System.out.println(forward.data);

        while (forward != null) {
            current.next = prev;
            prev = current;
            current = forward;
            forward = forward.next;
        }

        head.next = null;
        current.next = prev;
        head = current;
        return head;
    }

    //! Use the Hare and tortoise algo. to find the middle of the linked list in the optimal way
    public static boolean isListPalindrome(ReverseALinkedList.LinkedList head) {
        int size = 0, half = 0;
        if(head == null || head.next == null) {
            return true;
        }

        ReverseALinkedList.LinkedList temp = head;
        ReverseALinkedList.LinkedList middle = head;

        //! Reaching the middle number
        while(temp != null) {
            size++;
            temp = temp.next;
        }

        half = size/2;
        int i = 0;
        //! Reaching to the middle node
        //!   1 -> 2 -> 3 -> 2 -> 1 -> null
        while (i < half) {
            middle = middle.next;
            i++;
        }
        //! middle = 2 -> 1 -> null
        //! Head = 1 -> 2 -> 3 -> 2 <- 1
        //!                null <_|
        //! so we have to point the middle node to null
        //! List from head same as old and we need to beak the connection

        ReverseALinkedList.LinkedList reverse = reverse(middle.next);
        middle.next = null;
        ReverseALinkedList reverseALinkedList = new ReverseALinkedList();

        //! Compare the lists
        i = 0;
        while(i < 2) {
            if(reverse.data.equals(head.data)) {
                reverse = reverse.next;
                head = head.next;
                i++;
            }else{
                return false;
            }
        }



        return true;
    }

    public static void main(String[] args) {
        ReverseALinkedList.LinkedList  head = new ReverseALinkedList.LinkedList("1");
//        ReverseALinkedList reverseALinkedList = new ReverseALinkedList();
        ReverseALinkedList.head = head;

        ReverseALinkedList.LinkedList  node1 = new ReverseALinkedList.LinkedList("2");
        head.next = node1;

        ReverseALinkedList.LinkedList  node2 = new ReverseALinkedList.LinkedList("3");
        node1.next = node2;

        ReverseALinkedList.LinkedList  node3 = new ReverseALinkedList.LinkedList("2");
        node2.next = node3;

        ReverseALinkedList.LinkedList  node4 = new ReverseALinkedList.LinkedList("1");
        node3.next = node4;
        node4.next = null;

        ReverseALinkedList reverseALinkedList = new ReverseALinkedList();
//        reverseALinkedList.printList(head);
        boolean listPalindrome = isListPalindrome(head);
        System.out.println(listPalindrome);
    }
}
