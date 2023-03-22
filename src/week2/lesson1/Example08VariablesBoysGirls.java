package week2.lesson1;

import java.util.Scanner;

public class Example08VariablesBoysGirls {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        float x = input.nextFloat();
        float y = input.nextFloat();

        float boysPerc = x / (x+y) * 100;
        float girlsPerc = y / (x+y) * 100;

        System.out.println("Male percentage: " + boysPerc + " %");
        System.out.println("Female percentage: " + girlsPerc + " %");
    }
}