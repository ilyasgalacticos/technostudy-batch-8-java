package week6.lesson4;

import java.util.Scanner;

/*
   Write a method that takes a string and a letter as arguments. You need to count how many times the letter appears in the text. (Case insensitive)

    Input
    bitlab
    b
    Output
    2

    Input
    Javavaction
    a
    Conclusion
    3
*/
public class Task02Methods {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String text = in.nextLine();
        String inputLetter = in.next(); // Input letter is String -> "A"
        char letter = inputLetter.charAt(0); // I will get 0-th element of inputLetter -> 'A'
        // Scanner can not directly read chars
        // We are firstly reading our letter as String, because we have next() method
        // Our read text's 0-th element will be our char

        System.out.println(countLetters(text, letter));

    }

    public static int countLetters(String text, char letter) {
        String tempText = letter+""; // Converting char into String
        tempText = tempText.toLowerCase(); // Converting into Lower Case
        letter = tempText.charAt(0); // Get 0-letter from text, we will get letter back

        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if(text.toLowerCase().charAt(i)==letter){ // text[i] == letter
                count++;
            }
        }
        return count;
    }
}