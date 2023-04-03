package week3.lesson2;

import java.util.Scanner;

public class Example01LoopsDoWhile {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        int n;
        do{
            n = in.nextInt();
            count++;
        }while (n!=0);
        System.out.println(count-1);
    }
}
