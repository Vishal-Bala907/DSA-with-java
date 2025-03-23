package com.multithreading;

public class ThreadClassDemo  extends Thread {

    ThreadClassDemo() {
        super("new thread");
        start();
    }

    @Override
    public void run() {
        for (int i =0; i < 5; i++) {
            try {
                System.out.println("Thread running");
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        new ThreadClassDemo();
    }
}
