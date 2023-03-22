package week2.lesson1;

import java.util.Scanner; // Please Scanner, can you help me to scan?
public class Example2VariablesSum2 {
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        // creating Scanner variable, called 'input'
        // int a -> creating integer variable, called 'a'

        int a = input.nextInt(); // I will assign value of 'a' from console // parallelogram input
        int b = input.nextInt(); // I will assign value of 'b' from console
        int sum = a + b;
        System.out.println(sum);
    }
}