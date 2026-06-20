package Deepskilling.EngineeringConcepts.DesignPatternandPrinciples.Exercise4;

public class AdapterTest {
    public static void main(String[] args) {

        PaymentProcessor payment =
                new PayPalAdapter(new PayPalGateway());

        payment.processPayment(1000);
    }
}
