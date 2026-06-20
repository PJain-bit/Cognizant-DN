class Car {
    // Define attributes [cite: 129]
    String make;
    String model;
    int year;

    // Constructor to initialize attributes
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Implement a method displayDetails() to print car information[cite: 130].
    public void displayDetails() {
        System.out.println("Car Details -> Year: " + year + ", Make: " + make + ", Model: " + model);
    }
}
public class Ex17_CarClassDemo {
    public static void main(String[] args) {
        // Create objects of the Car class and call the method[cite: 131].
        Car car1 = new Car("Toyota", "Camry", 2022);
        Car car2 = new Car("Tesla", "Model 3", 2024);

        car1.displayDetails();
        car2.displayDetails();
    }
}
