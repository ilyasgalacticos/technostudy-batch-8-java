package week3.lesson1;

import java.util.Scanner;

public class Example04ForLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        for(int i = n; i <= m; i++){
            System.out.println(i);
        }

    }
}
