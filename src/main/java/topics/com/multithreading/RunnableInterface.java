package topics.com.multithreading;

public class RunnableInterface implements Runnable {
    Thread t;
    RunnableInterface(String msg) {
        t = new Thread(this , msg);
        t.start();
    }
    @Override
    public void run() {
        for (int i =0; i < 5; i++) {
            try {
                System.out.println("Thread running \t " + Thread.currentThread().getName());
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        RunnableInterface myThread = new RunnableInterface("My Thread");

        try {
            myThread.t.join();
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }

        new RunnableInterface("Our thread");
        new RunnableInterface("Their thread");
    }
}
