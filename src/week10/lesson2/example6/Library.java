package week10.lesson2.example6;

public class Library {
    private final int maxSize = 5;
    private Book[] books = new Book[maxSize];
    private int index = 0;

    // Tool that adds new book into array
    // Some helper (worker) that adds book into array
    public void addBook(Book b){
        if(index < maxSize){
            books[index] = b;
            index++;
        }else{
            throw new LibraryFullException();
        }
    }

    public void printBooks(){
        for(int i = 0; i < index; i++){
            System.out.println(books[i].getData());
        }
    }
}
