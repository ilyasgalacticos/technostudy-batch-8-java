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
        books.add(b);
    }

    @Override
    public void removeBook(Book b) {
        books.remove(b);
    }

    @Override
    public Book searchBookByTitle(String title) {
        for(Book book : books){
            if(book.getTitle().equals(title)){
                return book;
            }
        }
        return null;
    }

    @Override
    public List<Book> searchBookByAuthor(String author) {
        ArrayList<Book> foundBooks = new ArrayList<>();
        for(Book book : books){
            if(book.getAuthor().equals(author)){
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }

    @Override
    public List<Book> listBooks() {
        return books;
    }
}
