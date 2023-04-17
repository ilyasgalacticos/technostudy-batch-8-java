package week6.lesson1;

import java.util.Scanner;

public class ExampleTask05RepeatString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String text = in.nextLine(); // "  Hello  "; - 9 symbols, 0 -> 8

        if(text.charAt(0)==' ' && text.charAt(text.length()-1)==' '){
            text = text.trim();
            text = "("+text+")";
        }
        System.out.println(text);
    }
}
