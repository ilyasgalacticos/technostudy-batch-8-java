package libraryproject;

import java.util.List;

public interface LibraryOperations {

    void addBook(BookData b);
    void removeBook(BookData b);
    BookData searchBookByTitle(String title);
    List<BookData> searchBookByAuthor(String author);
    List<BookData> listBooks();

}
