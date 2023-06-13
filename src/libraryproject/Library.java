package libraryproject;

import java.util.ArrayList;
import java.util.List;

public class Library implements LibraryOperations, LibraryExtraOperations {

    private int id;

    private List<BookData> books;

    public Library() {
        this.books = new ArrayList<>();
        this.id = 1;
    }

    @Override
    public void addBook(BookData b) {
        b.setId(id);
        books.add(b);
        id++;
    }

    @Override
    public void removeBook(BookData b) {
        books.remove(b);
    }

    @Override
    public BookData searchBookByTitle(String title) {
        for (BookData book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    @Override
    public List<BookData> searchBookByAuthor(String author) {
        ArrayList<BookData> foundBooks = new ArrayList<>();
        for (BookData book : books) {
            if (book.getAuthor().equals(author)) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }

    @Override
    public List<BookData> listBooks() {
        return books;
    }

    @Override
    public void updateBook(BookData oldBook, BookData newBook) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == oldBook.getId()) {
                books.set(i, newBook);
            }
        }
    }

    @Override
    public BookData getBook(int id) {
        for (BookData bookData : books) {
            if (bookData.getId() == id) {
                return bookData;
            }
        }
        return null;
    }
}
