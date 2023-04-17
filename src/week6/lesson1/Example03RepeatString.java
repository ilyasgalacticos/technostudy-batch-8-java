package week6.lesson1;

import java.util.Scanner;

public class Example03RepeatString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String initialText = in.nextLine();
        char arr[] = initialText.toCharArray();
        String text = new String(arr);
        System.out.println(text);
    }
}
