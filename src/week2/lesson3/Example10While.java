package week2.lesson3;

import java.util.Scanner;

public class Example10While {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 0;
        int i = 1;
        while(i <= n){
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
    }
}