package week10.lesson1.example6;

public class Library {
    private Book[] books = new Book[10];
    // [b1,  null, null, null, null, null, null, null, null, null]
    //   *
    // index = 1
    private int index = 0;

    public void addBook(Book book) {
        books[index] = book;
        index++;
    }

    public void printBooks() {
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getData());
        }
    }

}
