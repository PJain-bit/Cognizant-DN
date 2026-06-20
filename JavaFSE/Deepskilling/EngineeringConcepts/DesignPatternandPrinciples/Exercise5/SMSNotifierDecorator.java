package Deepskilling.EngineeringConcepts.DesignPatternandPrinciples.Exercise5;

public class SMSNotifierDecorator extends NotifierDecorator {

    public SMSNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    public void send(String message) {
        notifier.send(message);
        System.out.println("SMS: " + message);
    }
}
