package week2.lesson4;

import java.util.Scanner;

public class Example06While {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n = input.nextDouble();
        double m = input.nextDouble();
        double i = n;
        double sum = 0;
        double count = 0;
        while(i<=m){
            sum = sum + i;
            i++;
            count++;
        }
        System.out.println(sum/count);
        //System.out.println(sum/(m-n+1));
    }
}
