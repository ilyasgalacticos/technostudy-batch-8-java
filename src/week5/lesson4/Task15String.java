package week5.lesson4;

import java.util.Scanner;

public class Task15String {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();

        if(s1.contains(s2)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
