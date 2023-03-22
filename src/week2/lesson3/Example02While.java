package week2.lesson3;

import java.util.Scanner;

public class Example02While {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i = 1;
        while (i <= n){
            System.out.println(i);
            i++;  //i++ means i = i + 1 means i+=1
            //i+=2 means i = i + 2
        }
    }
}
