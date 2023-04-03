package week3.lesson1;

import java.util.Scanner;

public class ExampleBonus03ForLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = n; i >= 0; i--) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}