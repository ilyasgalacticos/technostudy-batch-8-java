package week3.lesson4;

import java.util.Scanner;

public class Example10Arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int incomes[] = new int[n];
        for(int i = 0; i<incomes.length;i++){
            incomes[i] = in.nextInt();
        }

        int sum = 0;
        for(int i=0;i<incomes.length;i++){
            sum = sum + incomes[i];
        }
        System.out.println(sum);

    }
}
