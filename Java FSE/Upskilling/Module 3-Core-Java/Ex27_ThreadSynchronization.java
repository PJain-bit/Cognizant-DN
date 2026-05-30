class Counter {
    private int count = 0;

    // Use synchronized keyword to ensure only one thread increments at a time
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
public class Ex27_ThreadSynchronization {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        // Create two threads that increment the same counter 1000 times each
        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();

        // Wait for both threads to finish execution
        thread1.join();
        thread2.join();

        // Expected count is exactly 2000 due to synchronization
        System.out.println("Final Counter Value (Should be 2000): " + counter.getCount());
    }
    
}
