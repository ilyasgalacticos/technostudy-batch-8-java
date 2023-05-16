package week10.lesson2.example6;

public class LibraryFullException extends RuntimeException{
    @Override
    public String getMessage() {
        return "Library is full!";
    }
}
