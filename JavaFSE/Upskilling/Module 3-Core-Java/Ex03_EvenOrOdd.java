import java.util.Scanner;
public class Ex03_EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        // Use the modulus operator % to check divisibility by 2[cite: 21].
        if (number % 2 == 0) {
            System.out.println(number + " is even."); 
        } else {
            System.out.println(number + " is odd.");
        }
        
        scanner.close();
    }
}
