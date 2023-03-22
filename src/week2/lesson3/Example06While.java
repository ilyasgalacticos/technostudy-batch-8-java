package week2.lesson3;

import java.util.Scanner;

public class Example06While {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i = 0;

        while(i <= n){
            if(i%2==0) {
                System.out.println(i);
            }
            i++;
        }
    }
}