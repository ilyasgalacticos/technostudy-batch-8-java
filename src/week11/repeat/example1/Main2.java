package week11.repeat.example1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            int n = in.nextInt();
            int[] arr = new int[n];
            int x = 50 / n;
            System.out.println(x);
            arr[5] = 100;
        }catch (InputMismatchException e){
            System.out.println("Your input is incorrect!");
        }catch (NegativeArraySizeException e){
            System.out.println("You array size can not be negative");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Your array's index out of bounds");
        }catch (ArithmeticException e){
            System.out.println("You can not divide integer by 0");
        }catch (Exception e){
            System.out.println("You have other errors!");
        }
        System.out.println("Finished");
    }
}
