import java.util.ArrayList;
import java.util.Scanner;
public class Ex24_ArrayListExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Create an ArrayList to store names
        ArrayList<String> students = new ArrayList<>();
        
        // Task: Manage a list of student names.
        System.out.println("--- Student Directory (ArrayList) ---");
        System.out.print("How many student names do you want to add? ");
        int count = scanner.nextInt();
        scanner.nextLine(); // Consume trailing newline
        
        // Allow the user to add names to the list
        for (int i = 0; i < count; i++) {
            System.out.print("Enter name for student " + (i + 1) + ": ");
            String name = scanner.nextLine();
            students.add(name);
        }
        
        // Display all names entered
        System.out.println("\nAll entered student names:");
        for (String student : students) {
            System.out.println("- " + student);
        }
        
        scanner.close();
    }
}
