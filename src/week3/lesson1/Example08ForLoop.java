package week3.lesson1;

import java.util.Scanner;

public class Example08ForLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        for(int i = n; i <= m; i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
}