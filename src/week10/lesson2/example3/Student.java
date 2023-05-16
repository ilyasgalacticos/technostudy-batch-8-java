package week10.lesson2.example3;

public class Student {
    private String fullName;
    private double gpa;

    public Student() {
    }

    public Student(String fullName, double gpa) {
        this.fullName = fullName;
        this.gpa = gpa;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
