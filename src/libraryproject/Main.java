package libraryproject;

import week9.lesson3.example4.B;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Library library = new Library();
        library.addBook(new Book("Harry Potter and Philosophy Stone", "Joanne Rowling"));
        library.addBook(new Book("Harry Potter and the Chamber of Secrets", "Joanne Rowling"));
        library.addBook(new Book("Harry Potter and the Prisoner of Azkaban", "Joanne Rowling"));
        library.addBook(new Book("Harry Potter and the Goblet of Fire", "Joanne Rowling"));
        library.addBook(new Book("Java Standard Edition", "Ilyas Zhuanyshev"));
        library.addBook(new Book("Java Enterprise Edition", "Ilyas Zhuanyshev"));
        library.addBook(new Book("PHP", "Mark Zuckerberg"));

        List<Book> allBooks = library.listBooks();

        for(Book b : allBooks){
            System.out.println(b);
        }

    }

}
