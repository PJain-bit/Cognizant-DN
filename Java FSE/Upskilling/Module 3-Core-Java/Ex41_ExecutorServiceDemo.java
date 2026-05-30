import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
public class Ex41_ExecutorServiceDemo {
    public static void main(String[] args) {
        // Task: Execute multiple Callable tasks that return results using a fixed thread pool.
        int poolSize = 3;
        ExecutorService executor = Executors.newFixedThreadPool(poolSize);
        List<Future<Integer>> futuresList = new ArrayList<>();

        System.out.println("Initializing Fixed Thread Pool with size: " + poolSize);

        // Submit 5 distinct callable calculation tasks onto worker queues
        for (int i = 1; i <= 5; i++) {
            final int taskNumber = i;
            Callable<Integer> calculationTask = () -> {
                int computationResult = taskNumber * 10;
                System.out.println("[" + Thread.currentThread().getName() + "] Processing task #" + taskNumber);
                return computationResult;
            };
            
            // Capture tracking promises via Future objects
            futuresList.add(executor.submit(calculationTask));
        }

        // Collect matching computation result data strings securely
        System.out.println("\nCollecting compute payload results from future queues:");
        try {
            for (int i = 0; i < futuresList.size(); i++) {
                Future<Integer> trackingPromise = futuresList.get(i);
                // Future.get() blocks execution processing synchronously until results are produced
                Integer resolvedValue = trackingPromise.get();
                System.out.println("Task #" + (i + 1) + " returned compilation value output: " + resolvedValue);
            }
        } catch (Exception e) {
            System.out.println("Processing Engine Error: " + e.getMessage());
        } finally {
            // Always shut down executor engines gracefully to release underlying system memory fields
            executor.shutdown();
            System.out.println("\nThread Pool Engine shut down cleanly.");
        }
    }
}
