package week3.lesson3;

import java.util.Scanner;

public class ArraysExample {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        double marks[] = new double[size];

        for(int i = 0; i < marks.length; i++){
            marks[i] = in.nextDouble();
        }

        for(int i = 0; i < marks.length; i++){
            System.out.println(marks[i]);
        }

    }
}
