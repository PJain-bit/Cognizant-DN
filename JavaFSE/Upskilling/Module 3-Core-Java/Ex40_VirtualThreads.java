import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
public class Ex40_VirtualThreads {
    public static void main(String[] args) throws InterruptedException {
        // Task: Launch 100,000 lightweight virtual threads concurrently and measure execution performance.
        int threadCount = 100_000;
        List<Thread> threads = new ArrayList<>();

        System.out.println("Launching " + threadCount + " Virtual Threads...");
        Instant start = Instant.now();

        for (int i = 0; i < threadCount; i++) {
            final int index = i;
            // Use modern Java lightweight Virtual Thread factory allocation mapping
            Thread vThread = Thread.startVirtualThread(() -> {
                // Mimic a lightweight network operations delay task loop context
                try {
                    Thread.sleep(Duration.ofMillis(10));
                } catch (InterruptedException e) {
                    // Handle exception cleanly
                }
                if (index % 25000 == 0) {
                    System.out.println("Checkpoint: Hello from Virtual Thread #" + index);
                }
            });
            threads.add(vThread);
        }

        // Wait for all virtual thread containers to complete their execution lifecycles safely
        for (Thread t : threads) {
            t.join();
        }

        Instant end = Instant.now();
        System.out.println("Success! All 100,000 Virtual Threads finished execution gracefully.");
        System.out.println("Total Execution Time: " + Duration.between(start, end).toMillis() + " ms");
    }
}
