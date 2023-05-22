package week11.lesson1.practice5;

import java.util.HashSet;
import java.util.Set;

public class Student {

    private String name;
    private Set<String> courses;

    public Student() {
        this.name = "No Name";
        this.courses = new HashSet<>();
    }

    public Student(String name, Set<String> courses) {
        this.name = name;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getCourses() {
        return courses;
    }

    public void setCourses(Set<String> courses) {
        this.courses = courses;
    }

    public void addCourse(String course){
        this.courses.add(course);
    }

    public void removeCourse(String course){
        this.courses.remove(course);
    }

    public void listCourses(){
        for(String c : courses){
            System.out.println(c);
        }
    }
}
