package week5.lesson4;

import java.util.Scanner;

public class Task08String {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String text = in.next(); // ONE
        text = text.toLowerCase();

        if(text.equals("one")){
            System.out.println(1);
        }else if(text.equals("two")){
            System.out.println(2);
        }else if(text.equals("three")){
            System.out.println(3);
        }else if(text.equals("four")){
            System.out.println(4);
        }else if(text.equals("five")){
            System.out.println(5);
        }else if(text.equals("six")){
            System.out.println(6);
        }else if(text.equals("seven")){
            System.out.println(7);
        }else if(text.equals("eight")){
            System.out.println(8);
        }else if(text.equals("nine")){
            System.out.println(9);
        }else if(text.equals("zero")){
            System.out.println(0);
        }

    }
}
