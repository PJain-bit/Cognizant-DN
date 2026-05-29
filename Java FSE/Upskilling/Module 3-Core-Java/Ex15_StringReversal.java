import java.util.Scanner;
public class Ex15_StringReversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        
        // Reverse the string
        String reversed = new StringBuilder(str).reverse().toString();
        
        // Display the reversed string
        System.out.println("Reversed string: " + reversed);
        
        scanner.close();
    }
}
