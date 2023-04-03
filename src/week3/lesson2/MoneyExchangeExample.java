package week3.lesson2;

import java.util.Scanner;

public class MoneyExchangeExample {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        do{

            System.out.println("-----------------------------------------------");
            System.out.println("PRESS [1] TO EXCHANGE 'TURKISH LIRA' TO 'USD'");
            System.out.println("PRESS [2] TO EXCHANGE 'USD' TO 'TURKISH LIRA'");
            System.out.println("PRESS [3] TO EXCHANGE 'TURKISH LIRA' TO 'EURO'");
            System.out.println("PRESS [4] TO EXCHANGE 'EURO' TO 'TURKISH LIRA'");
            System.out.println("PRESS [0] TO EXIT");

            int choice = in.nextInt();

            if(choice==0){
                System.out.println("BYE BYE!");
                break; // force quit
            }else if(choice==1){
                System.out.println("INSERT AMOUNT OF 'TURKISH LIRA' : ");
                double tl = in.nextDouble();
                System.out.println("Your " + tl + " 'TURKISH LIRA' WILL BE " + tl * 0.052296 + " 'USD'");
            }

        }while(true);

    }
}
