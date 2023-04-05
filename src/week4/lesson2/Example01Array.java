package week4.lesson2;

import java.util.Scanner;

public class Example01Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        int max = arr[0];
        int min = arr[0];
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
                maxIndex = i;
            }
            if(arr[i] < min){
                min = arr[i];
                minIndex = i;
            }
        }
        arr[maxIndex] = min;
        arr[minIndex] = max;

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
