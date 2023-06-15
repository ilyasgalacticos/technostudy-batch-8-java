package socialnet;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        SocialNetwork socialNetwork = new SocialNetwork();

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Insert email : ");
            String email = scanner.next();

            System.out.println("Insert password : ");
            String password = scanner.next();

            User user = socialNetwork.authenticate(email, password);

            if (user != null) {

                System.out.println("You are authenticated");

                while (true) {

                    System.out.println("#########################");
                    System.out.println("Welcome " + socialNetwork.getCurrentAuthenticatedUser().getFullName() + "!");
                    System.out.println(socialNetwork.getMenu());
                    String choice = scanner.next();

                    if (choice.equals("1")) {
                        System.out.println("##### PROFILE DATA #####");
                        System.out.println(socialNetwork.getCurrentAuthenticatedUser());

                    } else if (choice.equals("2")) {

                        System.out.println("Insert new name:");
                        String name = scanner.next();
                        System.out.println("Insert new surname:");
                        String surname = scanner.next();

                        socialNetwork.updateUserFullName(name, surname);
                        System.out.println("User updated successfully!");

                    } else if (choice.equals("3")) {
                        System.out.println("##### FRIENDS LIST #####");
                        ArrayList<User> friends = socialNetwork.getFriendList();
                        for(User u : friends){
                            System.out.println(u);
                        }

                    } else if (choice.equals("0")) {

                        socialNetwork.logout();
                        System.out.println("Bye Bye");
                        break;

                    } else {
                        System.out.println("Wrong command");
                    }
                }

            } else {

                System.out.println("Incorrect email or password!");

            }
        }
    }
}
