package Deepskilling.EngineeringConcepts.DesignPatternandPrinciples.Exercise3;

public class BuilderTest {
    public static void main(String[] args) {

        Computer pc = new Computer.Builder()
                .setCPU("i7")
                .setRAM("16GB")
                .setStorage("512GB SSD")
                .build();

        pc.display();
    }

}
