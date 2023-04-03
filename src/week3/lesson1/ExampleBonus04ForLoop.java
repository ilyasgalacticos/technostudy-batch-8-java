package week3.lesson1;

import java.util.Scanner;

public class ExampleBonus04ForLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean isPrime = true;
        for(int i = 2; i < n; i++){
            if (n % i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}