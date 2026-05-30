class MessagePrinter implements Runnable {
    private String threadName;

    public MessagePrinter(String threadName) {
        this.threadName = threadName;
    }

    // In the run() method, print a message multiple times
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("[" + threadName + "] Printing message count: " + i);
            try {
                // Sleep temporarily to observe interleaved execution patterns
                Thread.sleep(200); 
            } catch (InterruptedException e) {
                System.out.println(threadName + " was interrupted.");
            }
        }
    }
}
public class Ex26_ThreadCreation {
    public static void main(String[] args) {
        // Create Runnable tasks
        MessagePrinter task1 = new MessagePrinter("Thread-A");
        MessagePrinter task2 = new MessagePrinter("Thread-B");
        
        // Create Thread instances
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        
        // Start both threads and observe the output
        System.out.println("Starting both threads concurrently...");
        thread1.start();
        thread2.start();
    }
    
}
