package week4.lesson4;

import java.util.Scanner;

public class Task02TwoDArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // rows
        int m = in.nextInt(); // cols

        int[][] arr = new int[n][m];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextInt(); // insert number into i and j position
            }
        }

        int k = in.nextInt(); // k-th line, k is a row index

        for (int i = 0; i < arr[k].length; i++) {
            System.out.print(arr[k][i] + " ");
        }
    }
}
