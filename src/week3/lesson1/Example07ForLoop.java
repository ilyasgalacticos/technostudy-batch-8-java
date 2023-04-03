package week3.lesson1;

import java.util.Scanner;

public class Example07ForLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int prod = 1;
        for (int i = 1; i <= n; i++) {
            prod = prod * i;
        }
        System.out.println(prod);
    }
}