package week3.lesson1;

import java.util.Scanner;

public class Example03ForLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String text = in.next();
        int n = in.nextInt();

        for(int i = 0; i < n; i++){
            System.out.println(text);
        }
    }
}
