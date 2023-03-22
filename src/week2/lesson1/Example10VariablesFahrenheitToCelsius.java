package week2.lesson1;

import java.util.Scanner;

public class Example10VariablesFahrenheitToCelsius {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        double T = input.nextDouble();
        double C = (T-32) * 5/9;
        System.out.println(C);
    }
}