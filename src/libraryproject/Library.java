package libraryproject;

import java.util.ArrayList;
import java.util.List;

public class Library implements LibraryOperations {

    private List<BookData> books;

    public Library(){
        this.books = new ArrayList<>();
    }

    @Override
    public void addBook(BookData b) {
        books.add(b);
    }

    @Override
    public void removeBook(BookData b) {
        books.remove(b);
    }

    @Override
    public BookData searchBookByTitle(String title) {
        for(BookData book : books){
            if(book.getTitle().equals(title)){
                return book;
            }
        }
        return null;
    }

    @Override
    public List<BookData> searchBookByAuthor(String author) {
        ArrayList<BookData> foundBooks = new ArrayList<>();
        for(BookData book : books){
            if(book.getAuthor().equals(author)){
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }

    @Override
    public List<BookData> listBooks() {
        return books;
    }
}
