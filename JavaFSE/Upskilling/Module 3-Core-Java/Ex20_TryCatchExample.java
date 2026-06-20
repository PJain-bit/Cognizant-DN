import java.util.Scanner;

public class Ex20_TryCatchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for two integers[cite: 152].
        System.out.print("Enter first integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = scanner.nextInt();
        
        // Task: Handle division by zero using try-catch[cite: 150].
        try {
            // Attempt to divide the first by the second[cite: 153].
            int result = num1 / num2;
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            // Catch any ArithmeticException and display an appropriate message[cite: 154].
            System.out.println("Error caught: Cannot divide an integer by zero! [cite: 154]");
        }
        
        scanner.close();
    }
}
