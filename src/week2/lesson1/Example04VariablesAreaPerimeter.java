package week2.lesson1;

import java.util.Scanner;

public class Example04VariablesAreaPerimeter {
    public static void main(String args[]){ // Oval: start

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();    // Parallelogram: input a
        int b = input.nextInt();    // Parallelogram: input b

        int area = a*b;             // Rectangle: area = a*b
        int perimeter = 2*(a+b);    // Rectangle: perimeter = 2*(a+b);

        System.out.println(area);   // Parallelogram: output area
        System.out.println(perimeter);  // Parallelogram: output perimeter

    }   // Oval: end
}