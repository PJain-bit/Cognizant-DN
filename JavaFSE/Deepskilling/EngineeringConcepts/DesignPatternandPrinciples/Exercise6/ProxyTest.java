package Deepskilling.EngineeringConcepts.DesignPatternandPrinciples.Exercise6;

public class ProxyTest {
     public static void main(String[] args) {

        Image image = new ProxyImage("nature.jpg");

        image.display();

        System.out.println();

        image.display();
    }
}
