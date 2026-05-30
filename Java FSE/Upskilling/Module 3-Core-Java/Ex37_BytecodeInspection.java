public class Ex37_BytecodeInspection {
    public int addNumbers(int a, int b) {
        return a + b;
}
public static void main(String[] args) {
        Ex37_BytecodeInspection inspector = new Ex37_BytecodeInspection();
        int result = inspector.addNumbers(10, 20);
        System.out.println("Result of addNumbers: " + result);
        
        System.out.println("\n--- Bytecode Instructions ---");
        System.out.println("To inspect this compiled bytecode, type this command in your terminal:");
        System.out.println("javap -c Ex37_BytecodeInspection");
    }
}
