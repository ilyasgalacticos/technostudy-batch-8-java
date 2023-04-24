package week7.lesson1;


import java.util.Scanner;

// create simple method that will replace all negative elements in array into 0
public class Example04Methods {
    public static void main(String[] args) {
        int[] array = {10, 20, -4, -5, 65, -34, 67, 0, -1};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        replaceArray(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void replaceArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = 0;
            }
        }
    }
}