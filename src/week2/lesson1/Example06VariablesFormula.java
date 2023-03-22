package week2.lesson1;

import java.util.Scanner;

public class Example06VariablesFormula {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int res = 3*x*x - 6*x - 7;
        System.out.println(res);
    }
}