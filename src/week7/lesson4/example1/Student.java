package week7.lesson4.example1;

public class Student {
    String fullName; // fields, parameters
    String specialty;
    int grade;
    double gpa;

    public Student(){
        this.fullName = "Some Student";
        this.specialty = "IT";
        this.grade = 1;
        this.gpa = 1.67;
    }

    public Student(String fullName, String specialty, int grade, double gpa){
        this.fullName = fullName;
        this.specialty = specialty;
        this.grade = grade;
        this.gpa = gpa;
    }

    public String toString() {
        return this.fullName + "\n"
                + this.specialty + "\n"
                + this.grade + " year\n"
                + "GPA : " + this.gpa;
    }
}
