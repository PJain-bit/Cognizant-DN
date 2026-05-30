import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class Ex34_DateTimeApi {
    public static void main(String[] args) {
        // Task: Get the current date and time and format them cleanly.
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        LocalDateTime currentDateTime = LocalDateTime.now();

        System.out.println("Raw Current Date: " + currentDate);
        System.out.println("Raw Current Time: " + currentTime);

        // Use DateTimeFormatter to display them in a standard readable format
        DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = currentDateTime.format(customFormatter);

        System.out.println("\nFormatted Date and Time String:");
        System.out.println(formattedDateTime);
    }
}
