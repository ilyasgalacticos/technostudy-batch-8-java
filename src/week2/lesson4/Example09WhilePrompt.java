package week2.lesson4;

import java.util.Scanner;

public class Example09WhilePrompt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double n = input.nextDouble();
        double sum = 0;
        double count = 0;
        while(n!=0){
            sum = sum + n;
            count++;
            n = input.nextDouble();
        }
        System.out.println(sum/count);
    }
}
