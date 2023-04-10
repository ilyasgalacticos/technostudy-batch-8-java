package week4.lesson4;

import java.util.Scanner;

public class Task03TwoDArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int[][] matrix = new int[n][m];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }

    }
}
