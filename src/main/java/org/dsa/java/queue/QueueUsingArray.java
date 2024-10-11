package org.dsa.java.queue;

public class QueueUsingArray {
    static class Queue {
         int[] arr;
         int size;
         int rear = -1;
         int front = -1;

        public Queue() {
        }
        public Queue(int size) {
            arr = new int[size];
            this.size = size;
        }

        public boolean isEmpty() {
            return rear == -1;
        }
        public boolean isFull() {
//            System.out.println(rear < size-1);
            return !(rear < size - 1);
        }

        // add
        public void add(int data) {
            if(isFull()) {
                System.err.println("Queue is full....");
            }else {
                rear++;
                arr[rear] = data;
            }
        }
        // remove
        public int remove() {
            if(isEmpty()) {
                System.err.println("Queue is Empty....");
                return -1;
            }else {
                int r = arr[0];
                rear--;
                // shifting elements
                for(int i = 0; i<= rear; i++) {
                    arr[i] = arr[i+1];
                }

                return r;
            }
        }
        // print queue
        public void printQueue() {
            for(int i = 0; i<=rear; i++) {
                System.out.print(arr[i]+" , ");
            }
        }

        // peek
        public int peek() {
            if(isEmpty()) {
                System.err.println("Queue is Empty....");
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        queue.add(6);

        queue.printQueue();
        System.out.println();
        queue.remove();
        System.out.println();
        queue.printQueue();
        System.out.println();
        System.out.println(queue.peek());

        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
    }
}
