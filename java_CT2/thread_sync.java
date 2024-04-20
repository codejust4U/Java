class Counter {
    private int count;

    // synchronized method
    public synchronized void increament() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

class IncrementerThread extends Thread {
    private Counter counter;

    public IncrementerThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 5000; i++) {
            counter.increament();
        }
    }
}

public class thread_sync {
    public static void main(String args[]) throws Exception {
        Counter counter = new Counter();

        IncrementerThread thread1 = new IncrementerThread(counter);
        IncrementerThread thread2 = new IncrementerThread(counter);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Counter value : " + counter.getCount());
    }
}