package week5.lesson3;

import java.util.Scanner;

public class StringExample07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.next();
        char [] oldTextArray = text.toCharArray(); // I am converting my text into char array
        char [] reversedTextArray = new char[oldTextArray.length]; // [][][][][][][][] new empty char array

        for(int i = 0; i < oldTextArray.length; i++){
            reversedTextArray[i] = oldTextArray[oldTextArray.length - 1 - i];
        }

        String reversedText = new String(reversedTextArray); // I am creating new text from char array
        System.out.println(reversedText);
    }
}
