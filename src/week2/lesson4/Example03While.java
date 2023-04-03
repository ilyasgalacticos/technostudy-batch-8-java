package week2.lesson4;

import java.util.Scanner;

public class Example03While {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i = 1;
        int prod = 1;
        while(i <= n){
            prod = prod * i;
            i++;
        }
        System.out.println(prod);
    }
}
