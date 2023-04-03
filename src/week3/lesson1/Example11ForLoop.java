package week3.lesson1;

import java.util.Scanner;

public class Example11ForLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int sum = 0;
        for (int i = n; i <= m; i++) {
            sum+=i;
        }
        System.out.println(sum);
    }
}