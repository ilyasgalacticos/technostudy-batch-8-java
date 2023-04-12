package week5.lesson3;

import java.util.Scanner;

public class StringExample09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = "Java";

        if(text.equalsIgnoreCase("java")){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
