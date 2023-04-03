package week2.lesson4;

import java.util.Scanner;

public class Example08WhilePrompt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double n = input.nextInt();
        double sum = 0;
        while(n!=0){
            sum = sum + n;
            n = input.nextDouble();
        }
        System.out.println(sum);
    }
}
