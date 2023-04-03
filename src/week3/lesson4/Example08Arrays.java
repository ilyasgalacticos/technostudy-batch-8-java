package week3.lesson4;

import java.util.Scanner;

public class Example08Arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // I am building company
        // I got a task from our CEO to build n-flats house
        int n = in.nextInt();

        // Our builders built new house with n-flats
        int flats[] = new int[n];

        // Sales department, they are selling flats to numbers (random)
        for (int i = 0; i < flats.length; i++) {
            flats[i] = in.nextInt(); // next number will be placed in flat - i
        }

        for (int i = 0; i<flats.length; i++) {
            if(i%2==0){
                System.out.print(flats[i] + " ");
            }
        }
    }
}
