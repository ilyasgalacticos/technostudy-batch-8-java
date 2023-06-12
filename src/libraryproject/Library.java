package libraryproject;

import java.util.ArrayList;
import java.util.List;

public class Library implements LibraryOperations {

    private List<Book> books;

    public Library(){
        this.books = new ArrayList<>();
    }

    @Override
    public void addBook(Book b) {

    }

    @Override
    public void removeBook(Book b) {

    }

    @Override
    public Book searchBookByTitle(String title) {
        return null;
    }

    @Override
    public List<Book> searchBookByAuthor(String author) {
        return null;
    }

    @Override
    public List<Book> listBooks() {
        return null;
    }
}
