package Deepskilling.EngineeringConcepts.DesignPatternandPrinciples.Exercise5;

public class SlackNotifierDecorator extends NotifierDecorator {

    public SlackNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    public void send(String message) {
        notifier.send(message);
        System.out.println("Slack: " + message);
    }
}