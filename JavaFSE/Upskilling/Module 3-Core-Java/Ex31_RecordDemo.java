record StudentRecord(int id, String name, double marks) {}
public class Ex31_RecordDemo {
    public static void main(String[] args) {
        // Instantiate the record
        StudentRecord student1 = new StudentRecord(101, "Aman Sharma", 92.5);
        StudentRecord student2 = new StudentRecord(102, "Priya Patel", 88.0);

        // Print details using automatic clean toString() mapping
        System.out.println("Student 1 Data: " + student1);
        System.out.println("Student 2 Data: " + student2);

        // Demonstrating built-in accessor method functionality
        System.out.println("\nExtracting individual attributes:");
        System.out.println("Student 1 Name: " + student1.name());
        System.out.println("Student 2 Marks: " + student2.marks());
    }
}
