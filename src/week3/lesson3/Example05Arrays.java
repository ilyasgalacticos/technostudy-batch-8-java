package week3.lesson3;

import java.util.Scanner;

public class Example05Arrays {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n]; //5

        // [0] [0] [0] [0] [0]
        //  0   1   2   3   4

        for(int i=0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }

        // [25] [-5] [55] [0] [9] - length 5
        //  0     1    2   3   4
        for(int i=0;i<arr.length;i++){
            if(arr[i] > 0) {
                System.out.print(arr[i] + " ");
            }
        }
        // 25 55 9

    }
}
