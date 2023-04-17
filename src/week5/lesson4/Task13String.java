package week5.lesson4;

import java.util.Scanner;

public class Task13String {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.next().toLowerCase();
        char[] textChar = text.toCharArray();
        for(int i = 0; i < textChar.length; i++){
            if(textChar[i]=='a'){
                textChar[i] = 'o';
            }
        }
        text = new String(textChar);
        System.out.println(text);
    }
}
