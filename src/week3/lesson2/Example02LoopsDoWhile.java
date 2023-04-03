package week3.lesson2;

import java.util.Scanner;

public class Example02LoopsDoWhile {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        int sum = 0;
        do{
            n = in.nextInt();
            sum = sum + n;
        }while(n!=0);

        System.out.println(sum);

    }
}
