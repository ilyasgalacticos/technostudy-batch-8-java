package week10.lesson4.task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Student ilyas = new Student();
        ilyas.setName("Ilyas");

        System.out.println(ilyas);

        ilyas.addCourse("Java");
        ilyas.addCourse("Python");
        ilyas.addCourse("Operating Systems");

        System.out.println(ilyas);
        ilyas.addCourse("C++");
        System.out.println(ilyas);
        ilyas.removeCourse("Python");
        System.out.println(ilyas);
    }
}
