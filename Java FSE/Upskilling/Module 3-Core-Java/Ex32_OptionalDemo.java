import java.util.Optional;
public class Ex32_OptionalDemo {
    public static void main(String[] args) {
        // Task: Use the Optional class to handle a value that might be null.
        String nullableValue = null;

        // Wrap the variable inside an Optional container object
        Optional<String> checkNull = Optional.ofNullable(nullableValue);

        // Check if a value is present inside the container
        if (checkNull.isPresent()) {
            System.out.println("Value is available: " + checkNull.get());
        } else {
            System.out.println("Value is empty!");
        }

        // Provide a safe fallback default value if it is empty using orElse()
        String fallbackValue = checkNull.orElse("Default Safe Fallback String");
        System.out.println("Resulting Value: " + fallbackValue);
    }
}
