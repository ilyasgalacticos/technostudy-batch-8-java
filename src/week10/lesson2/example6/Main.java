package week10.lesson2.example6;

public class Main {

    public static void main(String[] args) {

        Library library = new Library();
        Book javaSe = new Book("Java SE", 300);
        library.addBook(javaSe);
        library.addBook(new Book("C++", 200));
        library.addBook(new Book("PHP", 100));
        library.addBook(new Book("Python", 300));
        library.addBook(new Book("Golang", 400));
        try {
            library.addBook(new Book("JavaScript", 200));
        }catch (Exception e){
            e.printStackTrace();
        }
        library.printBooks();

    }

}
