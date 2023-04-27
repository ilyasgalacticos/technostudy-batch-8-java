package week7.lesson4.example2;

public class Student {
    String fullName; // fields, parameters
    String specialty;
    int grade;
    double gpa;

    public Student() {
        this.fullName = "Some Student";
        this.specialty = "IT";
        this.grade = 1;
        this.gpa = 1.67;
    }

    public Student(String fullName, String specialty, int grade, double gpa) {
        this.fullName = fullName;
        this.specialty = specialty;
        this.grade = grade;
        this.gpa = gpa;
    }

    public String toString() {
        return this.fullName + " "
                + this.specialty
                + " " + this.grade
                + " year student "
                + "GPA: " + this.gpa;
    }
}
