package week2.lesson4;

import java.util.Scanner;

public class Example02While {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i = 0;
        int number = 3; // sequence, starts from 3
        int sum = 0;
        while(i<n){ // n - times loop
            sum = sum + number;  // get sum of that sequence
            number = number + 3; // always add another 3 to our sequence
            i++;
        }
        System.out.println(sum);
    }
}
