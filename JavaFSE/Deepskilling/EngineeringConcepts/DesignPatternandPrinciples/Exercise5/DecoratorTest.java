package Deepskilling.EngineeringConcepts.DesignPatternandPrinciples.Exercise5;

public class DecoratorTest {
    public static void main(String[] args) {

        Notifier notifier =
                new SlackNotifierDecorator(
                new SMSNotifierDecorator(
                new EmailNotifier()));

        notifier.send("Assignment Completed");
    }
}
