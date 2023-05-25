package week11.repeat.example1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = 10;
        int y = 20;

        try {
            int a = in.nextInt();
            System.out.println(a * a);
        }catch (Exception e){
            System.out.println("Some exception happened");
        }
        System.out.println("My program ended!");
    }
}
