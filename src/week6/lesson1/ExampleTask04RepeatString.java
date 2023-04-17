package week6.lesson1;

import java.util.Scanner;

public class ExampleTask04RepeatString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String text = in.nextLine();
        text = text.toLowerCase();

        String symb = in.next(); // "A"
        symb = symb.toLowerCase(); // "a"

        int index = text.indexOf(symb);

        if (index == -1) {
            System.out.println("THERE IS NO SUCH LETTER");
        }else{
            System.out.println(index);
        }
    }
}
