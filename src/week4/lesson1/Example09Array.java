package week4.lesson1;

import java.util.Scanner;

public class Example09Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        double arr[] = new double[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextDouble();
        }
        double m = in.nextDouble();
        double sum = 0;
        double amount = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > m){
                sum = sum + arr[i];
                amount++;
            }
        }

        System.out.println(sum/amount);

    }
}
