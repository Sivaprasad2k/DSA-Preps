class Counter {
    private int count;

    // The 'synchronized' keyword guarantees mutual exclusion:
    // Only ONE thread can execute this method at any instant in time.
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class synchronize {
    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        // Thread 1 increments the shared counter 1000 times
        Runnable task1 = () -> {
            for (int i = 1; i <= 1000; i++) {
                counter.increment();
            }
        };

        // Thread 2 increments the shared counter 1000 times
        Runnable task2 = () -> {
            for (int i = 1; i <= 1000; i++) {
                counter.increment();
            }
        };

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        // Start both threads concurrently
        t1.start();
        t2.start();

        // Wait for both threads to finish execution
        t1.join();
        t2.join();

        // Output guaranteed to be 2000 due to thread synchronization
        System.out.println("Final Count: " + counter.getCount());
    }
}
