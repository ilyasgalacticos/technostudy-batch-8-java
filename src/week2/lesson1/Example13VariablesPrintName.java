package week2.lesson1;

import java.util.Scanner;

public class Example13VariablesPrintName {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        String name = input.next();
        String surname = input.next();
        String city = input.next();
        int age = input.nextInt();

        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("City: " + city);
        System.out.println("Age: " + age);
    }
}