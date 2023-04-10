package week5.lesson1;

import java.util.Scanner;

public class Array2D04LastExample {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int arr[][] = new int[n][m];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 == 0) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
