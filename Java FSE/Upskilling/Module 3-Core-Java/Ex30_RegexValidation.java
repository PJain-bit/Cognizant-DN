import java.util.Scanner;
import java.util.regex.Pattern;
public class Ex30_RegexValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Regular expression pattern for a standard email validation
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);

        // Task: Validate email addresses using Regular Expressions.
        System.out.print("Enter an email address to validate: ");
        String email = scanner.nextLine();

        if (pattern.matcher(email).matches()) {
            System.out.println("Success: \"" + email + "\" is a valid email format.");
        } else {
            System.out.println("Invalid: \"" + email + "\" is not a valid email format.");
        }

        scanner.close();
    }
    
}
