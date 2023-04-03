package week3.lesson1;

import java.util.Scanner;

public class ExampleBonus01ForLoopV2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i <= n; i++){
            System.out.print((n-i) + " ");
        }
    }
}