package libraryproject;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Library library = new Library();
        library.addBook(new Book("Harry Potter and Philosophy Stone", "Joanne Rowling"));
        library.addBook(new Book("Harry Potter and the Chamber of Secrets", "Joanne Rowling"));
        library.addBook(new Book("Harry Potter and the Prisoner of Azkaban", "Joanne Rowling"));
        library.addBook(new Book("Harry Potter and the Goblet of Fire", "Joanne Rowling"));
        library.addBook(new Book("Java Standard Edition", "Ilyas Zhuanyshev"));
        library.addBook(new Book("Java Enterprise Edition", "Conde Nast Publications"));
        library.addBook(new Book("PHP", "Mark Zuckerberg"));
        library.addBook(new Magazine("World Football", "France Football", "vol.2"));
        library.addBook(new Magazine("GQ", "Conde Nast Publications", "Edition 34"));
        library.addBook(new Magazine("Vogue", "Conde Nast Publications", "Edition 56"));
        library.addBook(new Magazine("Vogue", "Conde Nast Publications", "Edition 34"));
        library.addBook(new Magazine("Vogue", "Conde Nast Publications", "Edition 21"));
        library.addBook(new Magazine("The New Yorker", "Conde Nast Publications", "Vol 9"));

        List<BookData> allBooks = library.listBooks();

        for(BookData b : allBooks){
            System.out.println(b);
        }

        System.out.println("--------------------");

        List<BookData> searchBooks = library.searchBookByAuthor("Conde Nast Publications");
        for(BookData b : searchBooks){
            System.out.println(b);
        }

        System.out.println("--------------------");

        BookData phpBook = library.searchBookByTitle("PHP");
        System.out.println(phpBook);

    }

}
