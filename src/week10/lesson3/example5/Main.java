package week10.lesson3.example5;

import java.util.Scanner;

//Contact Book Sample
public class Main {

    public static void main(String[] args) {

        Menu menu = new Menu();
        Scanner in = new Scanner(System.in);

        while (true) {

            System.out.println("-----------------------");
            System.out.println("PRESS 1 TO ADD CONTACT");
            System.out.println("PRESS 2 TO LIST CONTACT");
            System.out.println("PRESS 3 TO DELETE CONTACT");
            System.out.println("PRESS 0 TO EXIT");
            System.out.println("-----------------------");

            String choice = in.next();

            if (choice.equals("1")) {

                System.out.println("Insert name : ");
                String name = in.next();

                System.out.println("Insert surname : ");
                String surname = in.next();

                System.out.println("Insert phone : ");
                String phone = in.next();

                Contact contact = new Contact(name, surname, phone);
                menu.addContact(contact);
                System.out.println("Contact added successfully!");

            } else if (choice.equals("2")) {

                menu.printContactList();

            } else if (choice.equals("3")) {

                menu.printContactList();
                System.out.println("Choose number of contact to delete:");
                int index = in.nextInt();
                menu.deleteContact(index);
                System.out.println("Contact deleted successfully!");

            } else if (choice.equals("0")) {

                break;

            } else {
                System.out.println("Wrong Command");
            }
        }

    }

}
