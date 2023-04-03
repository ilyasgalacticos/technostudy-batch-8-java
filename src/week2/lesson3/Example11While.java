package week2.lesson3;

import java.util.Scanner;

public class Example11While {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();

        if(n>m){
            int temp = m;
            m = n;
            n = temp;
        }

        int i = n;
        int sum = 0;
        while(i<=m){
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
    }
}