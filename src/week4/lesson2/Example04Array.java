package week4.lesson2;

import java.util.Scanner;

public class Example04Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] firstArray = new int[n];

        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = in.nextInt();
        }

        int m = in.nextInt();
        int[] secondArray = new int[m];

        for (int i = 0; i < secondArray.length; i++) {
            secondArray[i] = in.nextInt();
        }

        int[] mergedArray = new int[n + m];
        int index = 0; // cursor

        for (int i = 0; i < firstArray.length; i++) {
            mergedArray[index] = firstArray[i];
            index++;
        }

        for (int i = 0; i < secondArray.length; i++) {
            mergedArray[index] = secondArray[i];
            index++;
        }

        for (int i = 0; i < mergedArray.length; i++) {
            System.out.print(mergedArray[i] + " ");
        }
    }
}
