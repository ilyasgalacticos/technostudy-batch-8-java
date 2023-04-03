package week2.lesson4;

import java.util.Scanner;

public class Example04While {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n = input.nextDouble();
        double i = 1;
        double sum = 0;
        while(i<=n){
            sum = sum + 1/i;
            i++;
        }
        System.out.println(sum);
    }
}
