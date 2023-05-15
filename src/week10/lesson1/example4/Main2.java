package week10.lesson1.example4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int arr[] = {10, 20, 30, 40, 50};
        int i, m;
        try {
            i = in.nextInt(); // 10
            m = in.nextInt(); // 0
            System.out.println(arr[i] / m);
        } catch (ArrayIndexOutOfBoundsException e) {
            i = 0;
            m = 2;
            e.printStackTrace();
            System.out.println(arr[i] / m);
        } catch (ArithmeticException e) {
            i = 0;
            m = 10;
            e.printStackTrace();
            System.out.println(arr[i] / m);
        } catch (InputMismatchException e) {
            i = 0;
            m = 1;
            e.printStackTrace();
            System.out.println(arr[i] / m);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("My Program is working!!!");
    }
}
