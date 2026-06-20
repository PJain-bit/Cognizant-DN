package Deepskilling.EngineeringConcepts.DesignPatternandPrinciples.Exercise11;

public class DependencyInjectionTest {

    public static void main(String[] args) {

        CustomerRepository repository =
                new CustomerRepositoryImpl();

        CustomerService service =
                new CustomerService(repository);

        service.getCustomer(101);
    }
}