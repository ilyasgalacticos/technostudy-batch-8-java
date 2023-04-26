package week7.lesson3.example2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("-------- CS GO GAME BY ILYAS ---------");
        Gun pistol = new Gun();
        pistol.name = "Colt";
        pistol.currentBullets = 0;
        pistol.capacity = 7;

        while(true){

            System.out.println("----------------------------------");
            System.out.println("PRESS [1] TO RELOAD GUN");
            System.out.println("PRESS [2] TO SHOT WITH GUN");
            System.out.println("PRESS [3] TO CHECK STATUS");
            System.out.println("PRESS [0] TO EXIT");

            String choice = in.next();

            if(choice.equals("0")){
                break;
            }else if(choice.equals("1")){
                pistol.reload();
            }else if(choice.equals("2")){
                pistol.shot();
            }else if(choice.equals("3")){
                pistol.printStatus();
            }else{
                System.out.println("Wrong Command!");
            }

        }

    }
}
