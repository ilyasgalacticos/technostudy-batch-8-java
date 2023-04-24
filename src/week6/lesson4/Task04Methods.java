package week6.lesson4;

import java.util.Scanner;

/*
    Create a method that takes String as an argument, and returns a new String in reversed order

    Input
    Hello

    Output
    olleH


    Input
    Java

    Conclusion
    avaJ

 */
public class Task04Methods {
    public static void main(String[] args) {
        System.out.println(reverseString("Hello"));
        System.out.println(reverseString("Ciao"));
        System.out.println(reverseString("Merhaba"));
        System.out.println(reverseTextV2("Bonjour"));
        System.out.println(reverseTextV2("Salem"));
        System.out.println(reverseTextV2("Privet"));
    }

    public static String reverseString(String text) {
        char[] reversedChar = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            int reversedIndex = text.length() - 1 - i;
            reversedChar[i] = text.charAt(reversedIndex);
        }
        String reversedString = new String(reversedChar);
        return reversedString;
    }

    public static String reverseTextV2(String text) {
        String result = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            result = result + text.charAt(i);
        }
        return result;
    }
}