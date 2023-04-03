package week2.lesson4;

import java.util.Scanner;

public class Example05While {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int i = 1;
        int sum = 0;

        while(i<=n){
            sum = sum + i*i;
            i++;
        }
        System.out.println(sum);
    }
}
