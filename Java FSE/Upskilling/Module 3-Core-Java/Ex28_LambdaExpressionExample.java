import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Ex28_LambdaExpressionExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Rahul");
        names.add("Amit");
        names.add("Vikram");
        names.add("Deepak");

        System.out.println("Original List: " + names);

        // Task: Use a lambda expression to sort a list of strings.
        // (s1, s2) -> s1.compareTo(s2) is the lambda replacing an anonymous Comparator
        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));

        System.out.println("Sorted List (Alphabetical): " + names);
    }
}
