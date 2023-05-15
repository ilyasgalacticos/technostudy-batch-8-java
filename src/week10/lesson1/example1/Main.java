package week10.lesson1.example1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Insert a and b:");
        try {

            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(a + b);

        } catch (Exception e) {
        }
        System.out.println("My program is ended");
    }
}
