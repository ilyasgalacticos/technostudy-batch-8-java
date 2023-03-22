package week2.lesson3;

import java.util.Scanner;

public class Example05While {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int sum = 0;
        int i = 0;
        while(i < m){
            sum = sum + n;
            i++;
        }
        System.out.println(sum);
    }
}
