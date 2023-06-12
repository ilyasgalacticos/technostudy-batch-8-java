package libraryproject;

import java.util.List;

public interface LibraryOperations {

    void addBook(Book b);
    void removeBook(Book b);
    Book searchBookByTitle(String title);
    List<Book> searchBookByAuthor(String author);
    List<Book> listBooks();

}
