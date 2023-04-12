package week5.lesson3;

import java.util.Scanner;

public class Task06String {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String text = in.next(); // "hello" - string
        text = text.toLowerCase();

        String symbolText = in.next(); // "l" - string
        symbolText = symbolText.toLowerCase();

        char symbol = symbolText.charAt(0); // 'l' - char
        char textArray[] = text.toCharArray(); // 'h','e','l','l','o'

        boolean found = false;

        for (int i = 0; i < textArray.length; i++) {
            if(textArray[i]==symbol){ //comparing 2 chars, ==
                System.out.println(i); // i - is an index of symbol
                found = true;
                break;
            }
        }

        if(!found){
            System.out.println("THERE IS NO SUCH LETTER");
        }

    }
}
