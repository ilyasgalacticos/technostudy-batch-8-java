package week2.lesson4;

import java.util.Scanner;

public class Example01While {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int i = n;
        int sum = 0;
        while(i<=m){
            if(i%2==0) {
                sum = sum + i;
            }
            i++;
        }
        System.out.println(sum);
    }
}
