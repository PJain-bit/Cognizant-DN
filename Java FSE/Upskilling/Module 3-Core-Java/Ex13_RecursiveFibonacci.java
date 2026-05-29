import java.util.Scanner;

public class Ex13_RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Task: Calculate the nth Fibonacci number using recursion[cite: 99].
        System.out.print("Enter a positive integer n: ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("Fibonacci number at position " + n + " is: " + fibonacci(n));
        }
        
        scanner.close();
    }
    
    // Define a recursive method fibonacci(int n) [cite: 102]
    public static int fibonacci(int n) {
        // Base cases
        if (n == 1) return 0;
        if (n == 2) return 1;
        
        // Recursive call
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

}
