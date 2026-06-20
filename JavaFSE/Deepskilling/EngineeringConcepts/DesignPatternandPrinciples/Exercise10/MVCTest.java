package Deepskilling.EngineeringConcepts.DesignPatternandPrinciples.Exercise10;

public class MVCTest {

    public static void main(String[] args) {

        Student model =
                new Student("Purvi", "101", "A");

        StudentView view =
                new StudentView();

        StudentController controller =
                new StudentController(model, view);

        controller.updateView();

        controller.setStudentGrade("A+");

        System.out.println();

        controller.updateView();
    }
}
