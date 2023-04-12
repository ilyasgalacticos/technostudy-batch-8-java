package week5.lesson3;

import java.util.Scanner;

public class Task04String {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String text = in.next();
        String converted = text.toLowerCase();

        if(converted.equals("java")){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
