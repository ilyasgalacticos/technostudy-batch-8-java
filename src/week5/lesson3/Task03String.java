package week5.lesson3;

import java.util.Scanner;

public class Task03String {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.next();
        if(text.equals("Java")){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
