package org.dsa.java.linked.iist;


// Apna college way
public class LinkedListBasic {
    static class LinkedListBasicNode {
        public String data;
        public LinkedListBasicNode next;

        public LinkedListBasicNode(String data) {
            this.data = data;
            this.next = null;

        }
    }
    LinkedListBasicNode head;
    private int size;

    public LinkedListBasic() {
        this.size = 0;
    }
    public void addFirst(String data) {
        LinkedListBasicNode node = new LinkedListBasicNode(data);
        size++;
        if(head == null) {
            head = node;
            return;
        }

        node.next = head;
        head = node;
    }

    public void addLast(String data) {
        LinkedListBasicNode node = new LinkedListBasicNode(data);
        size++;
        if(head == null) {
            head = node;
            return;
        }
        // traverse to the end
        LinkedListBasicNode helper = head;
        while(helper.next != null) {
            helper = helper.next;
        }

        helper.next = node;
    }
    public void printList() {

        if(head ==  null) {
            System.out.println("List is empty ...");
            return;
        }
        // traverse to the end
        LinkedListBasicNode helper = head;
        while(helper != null) {
            System.out.print(helper.data+" -> ");
            helper = helper.next;
        }
        System.out.println("null");
    }

    public void deleteFirst() {
        if(head == null) {
            System.out.println("list is empty");
            return;
        }
        size--;
        if(head.next == null) {
            head = null;
            return;
        }
        head = head.next;
    }

    public void deleteLast() {
        if(head == null) {
            System.out.println("list is empty");
            return;
        }
        // traverse to the end
        size--;
        LinkedListBasicNode helperFirst = head;
        LinkedListBasicNode helperSecond = head.next;
        while(helperSecond.next != null) {
            helperSecond = helperSecond.next;
            helperFirst = helperFirst.next;
        }

        helperFirst.next = null;

    }

    public LinkedListBasicNode reverseListRecursive(LinkedListBasicNode headNode ) {

        if(headNode == null || headNode.next == null) {
            return headNode;
        }
        LinkedListBasicNode newHead = reverseListRecursive(headNode.next);
        headNode.next.next = headNode;
        headNode.next = null;

        return newHead;

    }

    public void reverseListItr() {

        if(head == null || head.next == null) {
            return;
        }
        LinkedListBasicNode prev = head;
        LinkedListBasicNode current = head.next;
        LinkedListBasicNode forward = current.next;

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

    public static void main(String[] args) {

        LinkedListBasic head = new LinkedListBasic();


        head.addFirst("Is");
        head.addFirst("This");
        head.addLast("Linked");
        head.addLast("List");
//        head.printList();

//        head.deleteFirst();
//        head.printList();
//
//        head.deleteLast();
//        head.printList();

//        head.reverseListItr();
//        head.printList();
         head.head = head.reverseListRecursive(head.head);
        head.printList();


    }

}
