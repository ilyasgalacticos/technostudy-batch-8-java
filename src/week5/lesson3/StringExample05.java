package week5.lesson3;

public class StringExample05 {
    public static void main(String[] args) {
        String text = "Java EE"; // 0 to 6, length is 7

        System.out.println(text.length()); // This method returns us length of text

        int i = 8;

        if(i >= 0 && i < text.length()){
            // If your text length is 7 symbols, your indexes will be from 0 to 6
            System.out.println(text.charAt(i));
        }
    }
}
