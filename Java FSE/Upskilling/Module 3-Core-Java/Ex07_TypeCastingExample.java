public class Ex07_TypeCastingExample {
    public static void main(String[] args) {
        // Task: Convert a double to an int and vice versa.
        
        // 1. Double to int (Narrowing / Explicit Casting)
        double originalDouble = 45.89;
        int castedInt = (int) originalDouble;
        System.out.println("Original Double: " + originalDouble);
        System.out.println("Casted to Int: " + castedInt);
        
        // 2. Int to double (Widening / Implicit Casting)
        int originalInt = 25;
        double castedDouble = originalInt; // Automatic casting
        System.out.println("Original Int: " + originalInt);
        System.out.println("Casted to Double: " + castedDouble);
    }
}
