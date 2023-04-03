package week3.lesson2;

import java.util.Scanner;

public class Example03LoopsDoWhile {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float n;
        float sum = 0;
        float count = 0;
        do{
            n = in.nextFloat();
            sum+=n;
            count++;
        }while(n!=0);
        System.out.println(sum/(count-1));
    }
}
