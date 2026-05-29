public class Ex12_MethodOverloading {
    
    public static int add(int a, int b) {
        return a + b; // Return the sum [cite: 95]
    }
    
    
    public static double add(double a, double b) {
        return a + b; // Return the sum [cite: 95]
    }
    
    
    public static int add(int a, int b, int c) {
        return a + b + c; // Return the sum [cite: 95]
    }

    public static void main(String[] args) {
        
        System.out.println("Sum of 2 integers (5 + 10): " + add(5, 10));
        System.out.println("Sum of 2 doubles (5.5 + 10.5): " + add(5.5, 10.5));
        System.out.println("Sum of 3 integers (5 + 10 + 15): " + add(5, 10, 15));
    }
}
