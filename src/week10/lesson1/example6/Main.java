package week10.lesson1.example6;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("Java", "Prentice Hall", 200));
        library.addBook(new Book("C++", "Prentice Hall", 100));

        Book b1 = new Book("Martin Eden", "Jack London", 200);
        library.addBook(b1);
        library.addBook(new Book("PHP", "Prentice Hall", 100));
        library.addBook(new Book("C#", "Prentice Hall", 100));
        library.addBook(new Book("GOLANG", "Prentice Hall", 100));
        library.addBook(new Book("WEB", "Prentice Hall", 100));
        library.addBook(new Book("JavaScript", "Prentice Hall", 100));
        library.addBook(new Book("Python", "Prentice Hall", 100));
        library.addBook(new Book("Kotlin", "Prentice Hall", 100));

        library.addBook(new Book("Flutter", "Prentice Hall", 100));
        library.addBook(new Book("C", "Prentice Hall", 100));
        library.addBook(new Book("Scala", "Prentice Hall", 100));
        library.addBook(new Book("Erlang", "Prentice Hall", 100));

        library.printBooks();
    }
}
