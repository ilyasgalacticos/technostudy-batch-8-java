package libraryproject;

import java.util.List;

public interface LibraryOperations {

    void addBook(BookData b);
    void removeBook(BookData b);
    List<BookData> listBooks();

}
