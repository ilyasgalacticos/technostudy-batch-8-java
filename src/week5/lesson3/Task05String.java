package week5.lesson3;

import java.util.Scanner;

public class Task05String {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String firstText = in.next();
        String secondText = in.next();

        firstText = firstText.toUpperCase();
        secondText = secondText.toUpperCase();

        if(firstText.equals(secondText)){
            System.out.println("THEY ARE EQUAL");
        }else{
            System.out.println("THEY ARE NOT EQUAL");
        }

    }
}
