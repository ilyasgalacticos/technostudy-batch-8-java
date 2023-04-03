package week2.lesson4;

import java.util.Scanner;

public class Example10WhilePrompt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int champion = n;

        while(n!=0){
            if(n>champion){
                champion = n;
            }
            n = input.nextInt();
        }
        System.out.println(champion);
    }
}
