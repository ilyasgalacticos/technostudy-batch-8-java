package week5.lesson4;

import java.util.Scanner;

public class Task12String {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.next().toLowerCase();
        char symbol = in.next().toLowerCase().charAt(0);

        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i)==symbol){
                count++;
            }
        }
        System.out.println(count);
    }
}
