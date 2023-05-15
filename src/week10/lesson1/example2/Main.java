package week10.lesson1.example2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b;
        try{
            a = in.nextInt();
        }catch (Exception e){
            a = 10;
        }
        try{
            b = in.nextInt();
        }catch (Exception e){
            b = 20;
        }

        System.out.println(a + b);
        System.out.println("Program finished!");
    }
}
