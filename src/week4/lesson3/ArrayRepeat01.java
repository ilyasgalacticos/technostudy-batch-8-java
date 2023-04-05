package week4.lesson3;

import java.util.Scanner;

public class ArrayRepeat01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n]; // I created new array with size - n!

        // By using loop, we can "one by one" put elements into array
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt(); // I am inserting element from console
        }

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
