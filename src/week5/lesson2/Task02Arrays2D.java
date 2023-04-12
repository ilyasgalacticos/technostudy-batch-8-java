package week5.lesson2;

import java.util.Scanner;

public class Task02Arrays2D {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int[][] arr = new int[n][m];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        int max = arr[0][0];
        int min = arr[0][0];
        int maxI = 0, minI = 0, maxJ = 0, minJ = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(max < arr[i][j]){
                    max = arr[i][j];
                    maxI = i;
                    maxJ = j;
                }
                if(min > arr[i][j]){
                    min = arr[i][j];
                    minI = i;
                    minJ = j;
                }
            }
        }

        arr[maxI][maxJ] = min;
        arr[minI][minJ] = max;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
