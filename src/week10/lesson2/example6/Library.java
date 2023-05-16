package week10.lesson2.example6;

public class Library {
    private final int maxSize = 5;
    private Book[] books = new Book[maxSize];
    private int index = 0;

    public void addBook(Book book){
        if(index < maxSize){
            books[index] = book;
            index++;
        }else{
            throw new LibraryFullException();
        }
    }
}
