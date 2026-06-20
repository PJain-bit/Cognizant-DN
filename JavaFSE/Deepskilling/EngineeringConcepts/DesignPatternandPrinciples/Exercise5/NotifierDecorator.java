package Deepskilling.EngineeringConcepts.DesignPatternandPrinciples.Exercise5;

public abstract class NotifierDecorator implements Notifier {

    protected Notifier notifier;

    public NotifierDecorator(Notifier notifier) {
        this.notifier = notifier;
    }
}