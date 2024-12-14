package StudentManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.println("Welcome to the Student Information System\n");

        while (true) {
            System.out.println("Enter Student Details");
            System.out.print("First Name: ");
            String firstName = scanner.nextLine();

            System.out.print("Last Name: ");
            String lastName = scanner.nextLine();

            System.out.print("Year: ");
            String year = scanner.nextLine();

            System.out.print("Course: ");
            String course = scanner.nextLine();

            System.out.print("Section: ");
            String section = scanner.nextLine();

            System.out.print("Midterm Grade: ");
            float midtermGrade = Float.parseFloat(scanner.nextLine());

            System.out.print("Final Grade: ");
            float finalGrade = Float.parseFloat(scanner.nextLine());

            Student student = new Student(firstName, lastName, year, course, section, midtermGrade, finalGrade);
            students.add(student);

            System.out.print("Do you want to add another student? (yes/no): ");
            String choice = scanner.nextLine().trim().toLowerCase();
            if (!choice.equals("yes")) {
                break;
            }

            System.out.println();
        }

        System.out.println("\nStudent Details and Grades\n");
        for (Student student : students) {
            student.introduceSelf();
            System.out.println();
            student.evaluateGrade();
            System.out.println();
        }

        scanner.close();
    }
}
