package libraryproject;

import java.util.List;

public interface LibraryExtraOperations {

    BookData searchBookByTitle(String title);
    List<BookData> searchBookByAuthor(String author);
    void updateBook(BookData oldBook, BookData newBook);

    BookData getBook(int id);

}
