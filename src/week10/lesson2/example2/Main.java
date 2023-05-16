package week10.lesson2.example2;

import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        try{
            int arr[] = {10,20};
            System.out.println(arr[0]);
            System.out.println("YES");
        }catch (InputMismatchException e){
            System.out.println(e.getMessage());
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Finally I am done");
        }
    }
}
