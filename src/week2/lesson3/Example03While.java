package week2.lesson3;

import java.util.Scanner;

public class Example03While {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String text = input.next();
        int n = input.nextInt();
        int i = 0;
        while (i < n){
            System.out.println(text);
            i++;
        }
    }
}
