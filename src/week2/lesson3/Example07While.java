package week2.lesson3;

import java.util.Scanner;

public class Example07While {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int prod = 1;
        int i = 1;
        while (i <= n){
            prod = prod * i;
            //System.out.println("prod = "+ prod + ", i = "+i);
            i++;
        }
        System.out.println(prod);
    }
}