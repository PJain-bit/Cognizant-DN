import java.util.HashMap;
import java.util.Scanner;
public class Ex25_HashMapExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Create a HashMap with Integer keys (IDs) and String values (Names)
        HashMap<Integer, String> studentMap = new HashMap<>();
        
        // Task: Map student IDs to names.
        System.out.println("--- Student ID Mapping (HashMap) ---");
        System.out.print("How many records do you want to add? ");
        int entries = scanner.nextInt();
        
        // Allow the user to add entries
        for (int i = 0; i < entries; i++) {
            System.out.print("Enter Student ID (Integer): ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            System.out.print("Enter Student Name: ");
            String name = scanner.nextLine();
            
            studentMap.put(id, name);
        }
        
        // Retrieve and display a name based on an entered ID
        System.out.print("\nEnter a Student ID to look up: ");
        int searchId = scanner.nextInt();
        
        if (studentMap.containsKey(searchId)) {
            System.out.println("Student Found: " + studentMap.get(searchId));
        } else {
            System.out.println("No student found with ID: " + searchId);
        }
        
        scanner.close();
    }
    
}
