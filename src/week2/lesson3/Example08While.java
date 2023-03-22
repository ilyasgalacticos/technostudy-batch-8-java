package week2.lesson3;

import java.util.Scanner;

public class Example08While {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();

        int i = n;
        while(i <= m){
            if(i%2!=0) {
                System.out.println(i);
            }
            i++;
        }
    }
}