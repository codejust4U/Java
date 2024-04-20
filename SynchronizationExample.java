class Counter {
    private int count = 0;

    // Synchronized method
    public synchronized void increment() {
        System.out.println(count);
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
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
            counter.increment();
        }
    }
}

public class SynchronizationExample {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        IncrementerThread thread1 = new IncrementerThread(counter);
        IncrementerThread thread2 = new IncrementerThread(counter);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Counter value: " + counter.getCount());
    }
}
