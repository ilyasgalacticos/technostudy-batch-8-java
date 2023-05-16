package week10.lesson2.example4;

public class DangerousException extends Exception{
    @Override
    public String getMessage() {
        return "Your speed is too much! It is too dangerous!";
    }
}
