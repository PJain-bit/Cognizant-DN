import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Ex29_StreamApiFilter {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 45, 78, 23, 56, 89, 90, 11, 4);
        System.out.println("Original Collection: " + numbers);

        // Task: Filter even numbers from a collection using the Stream API.
        List<Integer> evenNumbers = numbers.stream()
                                           .filter(n -> n % 2 == 0) // Keep only even integers
                                           .collect(Collectors.toList());

        System.out.println("Filtered Collection (Even Numbers Only): " + evenNumbers);
    }
    
}
