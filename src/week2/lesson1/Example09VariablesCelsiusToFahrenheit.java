package week2.lesson1;

import java.util.Scanner;

public class Example09VariablesCelsiusToFahrenheit {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        double T = input.nextDouble();
        double F = T * 1.8 + 32;
        System.out.println(F);
    }
}