package week2.lesson3;

import java.util.Scanner;

public class Example09While {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i = 1;
        while(i <= n){
            System.out.println(i + " " + (i*i));
            //System.out.println(i + " " + (int)Math.pow(i,2));
            i++;
        }
    }
}