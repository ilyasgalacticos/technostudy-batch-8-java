package week3.lesson4;

import java.util.Scanner;

public class Example12Arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        float[] arr = new float[n];
        for(int i = 0; i<arr.length;i++){
            arr[i] = in.nextFloat();
        }

        float sum = 0;
        float count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                sum = sum + arr[i];
                count++;
            }
        }
        System.out.println(sum/count);
    }
}
