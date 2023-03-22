package week2.lesson3;

import java.util.Scanner;

public class Example01While {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i = 0;  // in rectangle shape created i = 0
        while(i < 10){
            System.out.println(n);
            i = i + 1;
        }
    }
}
