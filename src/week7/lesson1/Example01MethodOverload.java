package week7.lesson1;


import java.util.Scanner;

// create simple method that will replace all negative elements in array into 0
public class Example01MethodOverload {
    public static void main(String[] args) {
        getSum(5, 6);
        getSum("Ilyas", "Java");
        getSum(4, 5, 6);
        getSum(44, "Java");
    }

    public static void getSum(int a, int b) {
        System.out.println(a + b);
    }

    public static void getSum(String a, String b) {
        System.out.println(a + b);
    }

    public static void getSum(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void getSum(int a, String b) {
        System.out.println(a + b);
    }
}