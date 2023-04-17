package week6.lesson1;

import java.util.Scanner;

public class ExampleTask06RepeatString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String text = in.nextLine();

        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.charAt(i) + "" +text.charAt(i));
        }

    }
}
