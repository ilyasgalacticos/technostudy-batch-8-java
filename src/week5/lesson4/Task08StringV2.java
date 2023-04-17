package week5.lesson4;

import java.util.Scanner;

public class Task08StringV2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String text = in.next(); // ONE

        String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
                            // 0       1      2       3        4       5      6       7        8       9

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i].equalsIgnoreCase(text)){
                System.out.println(i);
                break;
            }
        }
    }
}
