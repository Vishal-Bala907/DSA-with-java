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
/*         head.head = head.reverseListRecursive(head.head);
        head.printList();*/


    }

}
