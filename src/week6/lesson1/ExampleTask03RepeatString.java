package week6.lesson1;

import java.util.Scanner;

public class ExampleTask03RepeatString {
    //The program asks for two words and compares them case-insensitively (uppercase and lowercase letters).
    //Print "THEY ARE EQUAL" if they are equal, and "THEY ARE NOT EQUAL" otherwise.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String textOne = in.nextLine();
        String textTwo = in.nextLine();

        if(textOne.equalsIgnoreCase(textTwo)){
            System.out.println("THEY ARE EQUAL");
        }else{
            System.out.println("THEY ARE NOT EQUAL");
        }

    }
}
