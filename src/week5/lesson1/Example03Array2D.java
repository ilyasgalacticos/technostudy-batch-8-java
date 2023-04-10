package week5.lesson1;

import java.util.Scanner;

public class Example03Array2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // n rooms
        int m = in.nextInt(); // m tables

        int arr[][] = new int[n][m]; // 1 building

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] * arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
