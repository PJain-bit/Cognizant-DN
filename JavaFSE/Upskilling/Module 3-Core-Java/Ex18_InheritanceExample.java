class Animal {
    // Animal class should have a method makeSound()[cite: 137].
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    // Dog class should override makeSound() to print "Bark"[cite: 138].
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}
public class Ex18_InheritanceExample {
    public static void main(String[] args) {
        // Instantiate both classes and call their methods[cite: 139].
        Animal genericAnimal = new Animal();
        Dog myDog = new Dog();

        System.out.print("Animal says: ");
        genericAnimal.makeSound();

        System.out.print("Dog says: ");
        myDog.makeSound();
    }
}
