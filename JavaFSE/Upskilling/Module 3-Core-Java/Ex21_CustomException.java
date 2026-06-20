import java.util.Scanner;
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
public class Ex21_CustomException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        try {
            // Throw InvalidAgeException if the user's age is less than 18[cite: 159].
            if (age < 18) {
                throw new InvalidAgeException("You must be at least 18 years old to access this content.");
            } else {
                System.out.println("Access Granted. You are old enough!");
            }
        } catch (InvalidAgeException e) {
            // Catch the exception and display a message[cite: 160].
            System.out.println("Custom Exception Caught: " + e.getMessage());
        }
        
        scanner.close();
    }
}
