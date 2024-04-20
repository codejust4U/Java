class MyThread extends Thread {
    @Override
    public void run() {
        // Code to be executed by the thread
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread()+ " Value " + i);
        }
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        // Code to be executed by the thread
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread() + " Value " + i);
        }
    }
}

public class Main {
    public static void main(String args[]) {
        // Example using Thread class
        MyThread t1 = new MyThread();
        t1.start(); // Starts the thread

        // Example using Runnable interface
        Thread t2 = new Thread(new MyRunnable());
        t2.start(); // Starts the�thread
    }
}