package week2.lesson1;

import java.util.Scanner;

public class Example03VariablesAverage {
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        float a = input.nextFloat();
        float b = input.nextFloat();
        float c = input.nextFloat();

        float result = (a+b+c)/3;

        System.out.println(result);
    }
}