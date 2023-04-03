package week2.lesson4;

import java.util.Scanner;

public class Example07WhilePrompt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int count = 0;
        while (n!=0){
            count++;
            n = input.nextInt();
        }
        System.out.println(count);
    }
}
