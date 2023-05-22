package week11.lesson1.practice5;

public class Main {

    public static void main(String[] args) {

        Student ilyas = new Student();
        ilyas.setName("Ilyas");

        ilyas.addCourse("Java");
        ilyas.addCourse("C++");
        ilyas.addCourse("Java");
        ilyas.addCourse("Java");
        ilyas.addCourse("C#");
        ilyas.addCourse("Python");

        ilyas.listCourses();
        ilyas.removeCourse("C#");

        System.out.println("-----------");
        ilyas.listCourses();
    }
}
