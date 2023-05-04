package week8.lesson4.example5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Contact[] memory = new Contact[1000];
        memory[0] = new RelativeContact("John Smith", "877777777", "brother");
        memory[1] = new RelativeContact("Jane Smith", "877777771", "sister");
        memory[2] = new WorkContact("Mark Luis", "877777772", "HR");
        memory[3] = new WorkContact("Sergio Smith", "877777773", "manager");
        memory[4] = new WorkContact("John Conor", "877777774", "chief");

        int currentIndex = 5;

        while (true) {

            System.out.println("PRESS 1 TO ADD CONTACT");
            System.out.println("PRESS 2 TO LIST CONTACTS");
            System.out.println("PRESS 0 EXIT");

            String choice = in.next();

            if (choice.equals("1")) {

                System.out.println("PRESS 1 TO ADD RELATIVE CONTACT");
                System.out.println("PRESS 2 TO ADD WORK CONTACT");
                System.out.println("PRESS 0 TO GO BACK");

                choice = in.next();

                if (choice.equals("1")) {

                    System.out.println("Insert name: ");
                    String name = in.next();
                    System.out.println("Insert surname: ");
                    String surname = in.next();
                    System.out.println("Insert phone number: ");
                    String phone = in.next();
                    System.out.println("Insert relative value: ");
                    String relative = in.next();

                    RelativeContact relativeContact = new RelativeContact();
                    relativeContact.setFullName(name + " " + surname);
                    relativeContact.setPhone(phone);
                    relativeContact.setRelativeValue(relative);

                    memory[currentIndex] = relativeContact;
                    currentIndex++;
                    System.out.println("Relative contact added!");

                } else if (choice.equals("2")) {

                    System.out.println("Insert name: ");
                    String name = in.next();
                    System.out.println("Insert surname: ");
                    String surname = in.next();
                    System.out.println("Insert phone number: ");
                    String phone = in.next();
                    System.out.println("Insert department: ");
                    String department = in.next();

                    WorkContact workContact = new WorkContact();
                    workContact.setFullName(name + " " + surname);
                    workContact.setDepartment(department);
                    workContact.setPhone(phone);

                    memory[currentIndex] = workContact;
                    currentIndex++;
                    System.out.println("Work contact added!");
                }

            } else if (choice.equals("2")) {

                System.out.println("PRESS 1 TO LIST RELATIVE CONTACTS");
                System.out.println("PRESS 2 TO LIST WORK CONTACTS");
                System.out.println("PRESS 3 TO LIST ALL CONTACTS");

                choice = in.next();

                if (choice.equals("1")) {
                    for (int i = 0; i < currentIndex; i++) {
                        if(memory[i] instanceof RelativeContact) {
                            System.out.println(memory[i].getData());
                        }
                    }
                } else if (choice.equals("2")) {
                    for (int i = 0; i < currentIndex; i++) {
                        if(memory[i] instanceof WorkContact) {
                            System.out.println(memory[i].getData());
                        }
                    }
                } else if (choice.equals("3")) {
                    for (int i = 0; i < currentIndex; i++) {
                        System.out.println(memory[i].getData());
                    }
                }

            } else if (choice.equals("0")) {

                break;

            } else {
                System.out.println("Wrong Command!");
            }

        }

    }

}
