package week3.lesson1;

import java.util.Scanner;

public class ExampleBonus05ForLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i + " ");
        }
    }
}