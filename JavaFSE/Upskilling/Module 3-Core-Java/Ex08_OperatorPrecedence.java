public class Ex08_OperatorPrecedence {
    public static void main(String[] args) {
        // Task: Evaluate and display the result of complex expressions.
        int result = 10 + 5 * 2;
        
        System.out.println("Expression: 10 + 5 * 2");
        System.out.println("Result: " + result);
        
        // Explanation of the order of operations
        System.out.println("\nExplanation:");
        System.out.println("1. Multiplication (*) has higher precedence than addition (+).");
        System.out.println("2. Therefore, 5 * 2 is evaluated first, which equals 10.");
        System.out.println("3. Then, 10 is added to the result (10 + 10), giving a final value of 20.");
    }
}
