import java.util.Scanner;
public class Ex09_GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the student's score: ");
        double score = scanner.nextDouble();
        
        char grade;
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else {
            grade = 'D';
        }
        
        System.out.println("The student's grade is: " + grade);
    }
}
