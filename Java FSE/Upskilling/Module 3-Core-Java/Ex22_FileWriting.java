import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Ex22_FileWriting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Task: Write user input to a text file.
        System.out.print("Enter a string to write to the file: ");
        String userInput = scanner.nextLine();
        
        // Write the string to a file named output.txt
        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write(userInput);
            // Confirm that the data has been written
            System.out.println("Success: Data has been written to output.txt");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
        
        scanner.close();
    }
    
}
