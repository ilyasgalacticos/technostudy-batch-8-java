package week5.lesson3;

import java.util.Scanner;

public class StringExample06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.next();
        int index = in.nextInt();

        if (index >= 0 && index < text.length()) {
            System.out.println(text.charAt(index)); // I am printing char at position index from text
        }else{
            System.out.println("My text - "+text+" doesn't have an index = "+index);
        }
    }
}
