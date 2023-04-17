package week5.lesson4;

import java.util.Scanner;

public class Task07String {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String text = in.nextLine(); // reads whole line as a text

        if(text.charAt(0)==' ' && text.charAt(text.length()-1)==' '){
            char arr[] = text.toCharArray();
            arr[0] = '(';
            arr[text.length()-1] = ')';
            text = new String(arr);
        }
        System.out.println(text);
    }
}
