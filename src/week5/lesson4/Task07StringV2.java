package week5.lesson4;

import java.util.Scanner;

public class Task07StringV2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String text = in.nextLine();

        if(text.charAt(0)==' ' && text.charAt(text.length()-1)==' '){
            text = text.trim();
            text = "("+text+")";
        }
        System.out.println(text);
    }
}
