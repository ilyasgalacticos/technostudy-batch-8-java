package week10.lesson1.example4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int arr[] = {10, 20, 30, 40, 50};
        int i, m;
        try {
            i = in.nextInt();
            m = in.nextInt();
            System.out.println(arr[i] / m);
        } catch (InputMismatchException e) {
            i = 0;
            m = 1;
            System.out.println(e.getMessage());
            System.out.println(arr[i] / m);
        } catch (ArrayIndexOutOfBoundsException e) {
            i = 0;
            m = 2;
            System.out.println(e.getMessage());
            System.out.println(arr[i] / m);
        } catch (ArithmeticException e) {
            i = 0;
            m = 10;
            System.out.println(e.getMessage());
            System.out.println(arr[i] / m);
        }


    }
}
