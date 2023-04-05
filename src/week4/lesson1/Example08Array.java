package week4.lesson1;

import java.util.Scanner;

public class Example08Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        int m = in.nextInt();
        int foundIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == m) {
                foundIndex = i;
                break;
            }
        }

        if (foundIndex == -1) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
            System.out.println(foundIndex);
        }
    }
}
