import java.io.*;
class Person implements Serializable {
    private static final long serialVersionUID = 1L; // Recommended identity tracking verification tag
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person[Name=" + name + ", Age=" + age + "]";
    }
}
public class Ex35_SerializationDemo {
    public static void main(String[] args) {
        Person targetPerson = new Person("Rohan Das", 23);
        String filename = "person_data.ser";

        // 1. Serialization (Save object data structure state down to a binary file format)
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(targetPerson);
            System.out.println("Object has been successfully serialized to file: " + filename);
        } catch (IOException e) {
            System.out.println("An error occurred during serialization: " + e.getMessage());
        }

        // 2. Deserialization (Reconstruct object state from the saved binary file data)
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            Person deserializedPerson = (Person) in.readObject();
            System.out.println("Object has been successfully reconstituted back from file memory!");
            System.out.println("Restored Content: " + deserializedPerson);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("An error occurred during deserialization: " + e.getMessage());
        }
    }
}
