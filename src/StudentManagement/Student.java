package StudentManagement;

public class Student {
    private String firstName, lastName, year, course, section;
    private float midtermGrade, finalGrade;

    public Student(String firstName, String lastName, String year, String course, String section, float midtermGrade, float finalGrade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
        this.course = course;
        this.section = section;
        this.midtermGrade = midtermGrade;
        this.finalGrade = finalGrade;
    }

    public void introduceSelf() {
        System.out.println("Name    : " + firstName + " " + lastName);
        System.out.println("Year    : " + year);
        System.out.println("Course  : " + course);
        System.out.println("Section : " + section);
    }

    public void evaluateGrade() {
        float average = (midtermGrade + finalGrade) / 2;

        System.out.println("Name    : " + firstName + " " + lastName);
        System.out.println("Average : " + average);

        String remarks;
        if (average > 100) {
            remarks = "Invalid Grade";
        } else if (average >= 98) {
            remarks = "With Highest Honor";
        } else if (average >= 95) {
            remarks = "With High Honor";
        } else if (average >= 90) {
            remarks = "With Honor";
        } else if (average > 75) {
            remarks = "Passed";
        } else {
            remarks = "Failed";
        }

        System.out.println("Remarks : " + remarks);
    }
}
