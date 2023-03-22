package week2.lesson1;

import java.util.Scanner;

public class Example11VariablesParisFrankfurt {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        double speed = input.nextDouble();
        double timeInHours = 571/speed;
        System.out.println(timeInHours*60);
    }
}