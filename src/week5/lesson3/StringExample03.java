package week5.lesson3;

public class StringExample03 {
    public static void main(String[] args) {
        String text = "Hello Java";
        char[] charArray = text.toCharArray(); // toCharArray converts string into char

        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i]);
        }
    }
}
