package week10.lesson2.example5;

import week10.lesson2.example4.DangerousException;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Main2 {
    public static void main(String[] args) throws DangerousException {

        try{
            Connection connection = DriverManager.getConnection("", "", "");
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM users");

            File file = new File("input.txt");
            FileInputStream inputStream = new FileInputStream(file);

        }catch (Exception e){

        }
    }
}
