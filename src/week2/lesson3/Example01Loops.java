package week2.lesson3;

import java.util.Scanner;

public class Example01Loops {
    public static void main(String []args) {

        Scanner input = new Scanner(System.in);

        int myWeight = input.nextInt();
        int goalWeight = input.nextInt();

        int days = 0;
        while(myWeight>goalWeight){
            myWeight = myWeight-2;
            days = days + 1;
        }

        System.out.println("I trained " + days + " days to become from "+myWeight + " kg");
    }
}