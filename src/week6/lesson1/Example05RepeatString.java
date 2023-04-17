package week6.lesson1;

import java.util.Scanner;

public class Example05RepeatString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char symb = 'a';
        symb++;

        System.out.println(symb + " - " + (int)symb);
        int symbAcii = symb;
        System.out.println(symbAcii);

    }
}
