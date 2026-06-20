import java.util.Scanner;
public class Ex16_PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Task: Check if a string is a palindrome[cite: 119].
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Remove non-alphanumeric characters and convert to lowercase[cite: 122].
        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        // Check if the string reads the same forwards and backwards[cite: 123].
        String reversed = new StringBuilder(cleaned).reverse().toString();
        
        if (cleaned.equals(reversed)) {
            System.out.println("\"" + input + "\" is a palindrome. [cite: 124]");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome. [cite: 124]");
        }
        
        scanner.close();
    }
}
