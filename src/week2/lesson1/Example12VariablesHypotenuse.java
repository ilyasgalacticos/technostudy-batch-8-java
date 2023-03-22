package week2.lesson1;

import java.util.Scanner;

public class Example12VariablesHypotenuse {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        double y = input.nextDouble();
        double h = Math.sqrt(x * x + y * y); // square root of x*x + y*y
        System.out.println(h);
    }
}