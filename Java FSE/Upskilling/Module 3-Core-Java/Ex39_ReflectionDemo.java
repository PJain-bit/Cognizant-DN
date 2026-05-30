import java.lang.reflect.Method;

class TargetSample {
    public void printSecretMessage(String prefix) {
        System.out.println(prefix + ": Dynamic Execution via Reflection Successful!");
    }
}
public class Ex39_ReflectionDemo {
    public static void main(String[] args) {
        // Task: Use Java Reflection API to load a class and invoke methods dynamically.
        try {
            // Load the target class by its string descriptor definition
            Class<?> clazz = Class.forName("TargetSample");
            Object instance = clazz.getDeclaredConstructor().newInstance();

            // Print available method definitions exposed inside the target metadata mirror
            System.out.println("Inspecting Methods found in TargetSample class:");
            Method[] methods = clazz.getDeclaredMethods();
            for (Method method : methods) {
                System.out.println("- Method Name: " + method.getName() + " | Parameters count: " + method.getParameterCount());
            }

            // Extract and invoke the method dynamically without referencing it directly in compilation
            Method targetMethod = clazz.getDeclaredMethod("printSecretMessage", String.class);
            System.out.println("\nInvoking method dynamically...");
            targetMethod.invoke(instance, "System Status");

        } catch (Exception e) {
            System.out.println("Reflection Error: " + e.getMessage());
        }
    }
}
