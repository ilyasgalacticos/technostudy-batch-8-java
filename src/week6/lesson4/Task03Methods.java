package week6.lesson4;

import java.util.Scanner;

/*
    Create a method that will return a power of number without using Math.pow() function

    Input
    4 2
    Output
    16


    Input
    5 3
    Conclusion
    125
*/
public class Task03Methods {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        System.out.println(mathPow(n, m)); // Abibas
    }

    public static int mathPow(int a, int b) { // camel case style
        int prod = 1;
        for (int i = 0; i < b; i++) {
            prod = prod * a;
        }
        return prod;
    }
}