package week5.lesson2;

import java.util.Scanner;

public class ExampleArray2DContactBook {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String [][] contacts = new String[10000][4];
        int currentIndex = 0;

        while (true){

            System.out.println("PRESS [1] - TO ADD CONTACT");
            System.out.println("PRESS [2] - TO LIST CONTACTS");
            System.out.println("PRESS [0] - TO EXIT");

            String command = in.next();

            if(command.equals("1")){ // command == "1"

                System.out.println("Insert your first name:");
                String name = in.next();

                System.out.println("Insert your last name:");
                String surname = in.next();

                System.out.println("Insert phone number:");
                String phone = in.next();

                System.out.println("Insert city:");
                String city = in.next();

                contacts[currentIndex][0] = name;
                contacts[currentIndex][1] = surname;
                contacts[currentIndex][2] = phone;
                contacts[currentIndex][3] = city;

                currentIndex++;

                System.out.println("Contact added successfully!");
                System.out.println();

            }else if(command.equals("2")){

                System.out.println();
                for(int i = 0; i < currentIndex; i++){
                    System.out.println(contacts[i][0]
                                    + " " + contacts[i][1]
                                    + " - " + contacts[i][2]
                                    + " from " + contacts[i][3]
                    );
                }
                System.out.println();

            }else if(command.equals("0")){
                System.out.println("Bye Bye!");
                break;
            }else {
                System.out.println("Wrong command, try again!");
            }
        }
    }
}
