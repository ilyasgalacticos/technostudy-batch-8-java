package week10.lesson2.example6;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Library library = new Library();
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("PRESS 1 TO ADD BOOK");
            System.out.println("PRESS 2 TO LIST BOOKS");
            System.out.println("PRESS 0 TO EXIT");

            String choice = in.next();

            if (choice.equals("1")) {
                System.out.println("Insert name of Book : ");
                String name = in.next();
                System.out.println("Insert price of Book : ");
                int price = 0;
                try {
                    price = in.nextInt();
                } catch (Exception e) {
                    in.next();
                }
                Book book = new Book(name, price);
                library.addBook(book);
                System.out.println("Book added successfully!");

            } else if (choice.equals("2")) {
                library.printBooks();
            } else if (choice.equals("0")) {
                break;
            } else {
                System.out.println("Wrong command!");
            }

        }

    }
}
