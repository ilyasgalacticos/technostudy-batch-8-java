package week3.lesson1;

import java.util.Scanner;

public class Example05ForLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();
        int sum = 0;

        for(int i = 0; i < m; i++){
            sum += n;
        }

        System.out.println(sum);
    }
}
