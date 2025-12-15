import java.util.Scanner;

class Student {
    String name;
    double marks;

    Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

class GradeCalculator {

    String calculateGrade(double marks) {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 75) {
            return "B";
        } else if (marks >= 50) {
            return "C";
        } else {
            return "D";
        }
    }
}

public class MainApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = input.nextLine();

        System.out.print("Enter marks: ");
        double marks = input.nextDouble();

        Student student = new Student(name, marks);
        GradeCalculator calculator = new GradeCalculator();

        String grade = calculator.calculateGrade(marks);

        student.displayDetails();
        System.out.println("Grade: " + grade);
    }
}
