import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Ex23_FileReading {
    public static void main(String[] args) {
        // Task: Read and display the contents of output.txt.
        System.out.println("Reading contents from output.txt...");
        
        // Open output.txt for reading
        try (BufferedReader reader = new BufferedReader(new FileReader("output.txt"))) {
            String line;
            // Read each line and display it on the console
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
            System.out.println("Make sure to run Ex22_FileWriting.java first to create the file!");
        }
    }
}
