public class Ex38_DecompileDemo {
    private final String secretKey = "SHARED_SECRET_TOKEN";

    public void sensitiveOperation() {
        System.out.println("Executing system logic with validation key...");
    }

    public static void main(String[] args) {
        Ex38_DecompileDemo demo = new Ex38_DecompileDemo();
        demo.sensitiveOperation();
        
        System.out.println("\n--- Learning Point ---");
        System.out.println("Because bytecode (.class) maps closely to original source structures,");
        System.out.println("decompilers (like CFR or JD-GUI) can easily reconstruct your raw code.");
        System.out.println("Always obfuscate sensitive production codebases!");
    }
}
