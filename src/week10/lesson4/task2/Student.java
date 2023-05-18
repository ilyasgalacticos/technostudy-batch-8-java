package week10.lesson4.task2;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<String> courses;

    public Student() {
        courses = new ArrayList<>();
    }

    public Student(String name, ArrayList<String> courses) {
        this.name = name;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<String> courses) {
        this.courses = courses;
    }

    public void addCourse(String course) {
        this.courses.add(course);
    }

    public void removeCourse(String course) {
        this.courses.remove(course);
    }

    public void listCourses() {
        for (String c : courses) {
            System.out.println(c);
        }
    }

    @Override
    public String toString() {
        String result = "--------------\n";
        result += "Name : " + this.name + "\n";
        for (String c : this.courses) {
            result += "[" + c + "]\n";
        }
        result += "--------------\n";
        return result;
    }
}
