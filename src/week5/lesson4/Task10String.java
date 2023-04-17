package week5.lesson4;

import java.util.Scanner;

public class Task10String {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.next();
        for(int i = 0; i < text.length(); i++){
            System.out.print(text.charAt(i)+""+text.charAt(i));
        }
    }
}
