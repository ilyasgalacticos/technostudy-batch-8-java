package week2.lesson1;

import java.util.Scanner;

public class Example07VariablesAreaVolume {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        double r = input.nextDouble();
        double area = 4*3.14*r*r;
        double volume = 4.0/3.0*3.14*r*r*r;
        System.out.println(area);
        System.out.println(volume);
    }
}