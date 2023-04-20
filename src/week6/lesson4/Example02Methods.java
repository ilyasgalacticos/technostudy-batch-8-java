package week6.lesson4;

import java.util.Scanner;

//create a method that will draw n x m rectangle via stars (*)
// Example :
/*
    n = 5, m = 4

    * * * *
    * * * *
    * * * *
    * * * *
    * * * *
*/
public class Example02Methods {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        rectangle(x, y);
    }

    public static void rectangle(int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}