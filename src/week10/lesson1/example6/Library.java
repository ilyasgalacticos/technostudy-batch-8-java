package week10.lesson1.example6;

public class Library {
    private Book[] books = new Book[10];
    //[{"Java", "Prentice Hall", 200}, {"C++", "Prentice Hall", 100}, {"Martin Eden", "Jack London", 200}, null, null, null, null, null, null, null]
    private int index = 0;

    public void addBook(Book book) {
        try{
            books[index] = book;
            index++;
        }catch (Exception e){
            System.out.println("Library is full");
        }
    }

    public void printBooks() {
        for (int i = 0; i < books.length; i++) {
            try{
                System.out.println(books[i].getData());
            }catch (Exception e){
            }
        }
    }

}
