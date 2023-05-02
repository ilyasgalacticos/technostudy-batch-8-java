package week8.lesson2.example1;

public class Worker {

    private String fullName;
    private double salary;
    private String department;

    public Worker(){
        this.fullName = "No Full Name";
        this.salary = 0;
        this.department = "No Department";
    }

    public Worker(String fullName, double salary, String department){
        this.fullName = fullName;
        this.salary = salary;
        this.department = department;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getData(){
        return this.fullName + " from "
                + this.department + " department with salary : "
                + this.salary + " USD";
    }
}
