package week3.lesson4;

import java.util.Scanner;

public class Example16Arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int k = in.nextInt();
        for(int i = 0; i<arr.length;i++){
            if(arr[i]%k==0){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
