package week5.lesson4;

import java.util.Scanner;

public class Task06String {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String text = in.next(); // Java
        text = text.toLowerCase(); // java
        String checkText = in.next(); // "A"
        checkText = checkText.toLowerCase(); // "a"
        char symbol = checkText.charAt(0); // 'a'

        int index = text.indexOf(symbol);
        if(index!=-1){
            System.out.println(index);
        }else{
            System.out.println("THERE IS NO SUCH LETTER");
        }
    }
}
