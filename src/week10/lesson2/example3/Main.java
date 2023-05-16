package week10.lesson2.example3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) {
        University harvard = new University();
        harvard.addStudent(new Student("Ilyas Zhuanyshev", 3.5));
        harvard.addStudent(new Student("Almas Zhuanyshev", 3.1));
        harvard.addStudent(new Student("Lionel Zhuanyshev", 3.2));
        harvard.addStudent(new Student("Cristiano Zhuanyshev", 3.3));
        harvard.addStudent(new Student("Sergio Zhuanyshev", 3.7));
        harvard.addStudent(new Student("John Zhuanyshev", 3.0));

        File file = new File("input.txt");
        FileInputStream fileInputStream = new FileInputStream(file);

        Connection connection = DriverManager.getConnection("", "", "");

    }
}
