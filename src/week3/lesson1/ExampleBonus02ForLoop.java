package week3.lesson1;

import java.util.Scanner;

public class ExampleBonus02ForLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        if (n < m) {
            for (int i = n; i <= m; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (int i = n; i >= m; i--) {
                System.out.print(i + " ");
            }
        }
    }
}