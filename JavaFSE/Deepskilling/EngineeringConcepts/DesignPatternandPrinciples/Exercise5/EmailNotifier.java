package Deepskilling.EngineeringConcepts.DesignPatternandPrinciples.Exercise5;

public class EmailNotifier implements Notifier {

    public void send(String message) {
        System.out.println("Email: " + message);
    }
}
