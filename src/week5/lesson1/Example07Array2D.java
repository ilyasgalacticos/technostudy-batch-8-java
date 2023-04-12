package week5.lesson1;

import java.util.Scanner;

public class Example07Array2D {
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

        int max = arr[0][0];
        int maxI = 0;
        int maxJ = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(max < arr[i][j]){
                    max = arr[i][j];
                    maxI = i;
                    maxJ = j;
                }
            }
        }
        System.out.println(max);
        System.out.println(maxI + " " + maxJ);
    }
}
