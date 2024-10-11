package org.dsa.java.queue;

public class CircularQueue {
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
            return rear == -1 && front == -1;
        }

        public boolean isFull() {
        //  System.out.println(rear < size-1);
            return (rear + 1) % size == front;
        }

        // add
        public void add(int data) {
            if (isFull()) {
                System.err.println("Queue is full....");
                return;
            }
            if(front == -1) {
                front = 0;
            }
            rear = (rear+1)%size;
            arr[rear] = data;
        }

        // remove
        public int remove() {
            if (isEmpty()) {
                System.err.println("Queue is Empty....");
                return -1;
            } else {
                int r = arr[front];
                if (rear == front) {
                    rear = front = -1;
                } else {
                    front = (front + 1) % size;
                }
                return r;
            }
        }

        // print queue
        public void printQueue() {
            do {
                System.out.println(peek());
                remove();
            }while (!isEmpty());
        }
        // peek
        public int peek() {
            if (isEmpty()) {
                System.err.println("Queue is Empty....");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(4);
        queue.add(5);

        queue.printQueue();

    }
}
