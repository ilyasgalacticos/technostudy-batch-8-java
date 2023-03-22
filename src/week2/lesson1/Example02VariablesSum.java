package week2.lesson1;

import java.util.Scanner;

public class Example02VariablesSum {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        // creating Scanner variable, called input
        // int a -> creating integer variable, called a

        int a = input.nextInt(); // I will assign value of 'a' from console
        int b = input.nextInt();
        int sum = a + b;
        System.out.println(sum);
    }
}