package week10.lesson2.example1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try{

//            int arr[] = new int[4];
//            System.out.println(arr[10]);
//            System.out.println(1/0);
//            int x = in.nextInt();

        }catch (InputMismatchException e){
            System.out.println("I am catching InputMismatchException");
        }catch (ArithmeticException e){
            System.out.println("I am catching ArithmeticException");
        }catch (NullPointerException e){
            System.out.println("I am catching NullPointerException");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("I am catching ArrayIndexOutOfBoundsException");
        }catch (Exception e){
            System.out.println("I am catching general Exception");
        }
    }
}
