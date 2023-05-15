package week10.lesson1.example6;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("Java", "Prentice Hall", 200));
        library.addBook(new Book("C++", "Prentice Hall", 100));

        Book b1 = new Book("Martin Eden", "Jack London", 200);
        library.addBook(b1);

    }
}
