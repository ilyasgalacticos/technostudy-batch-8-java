package week7.lesson1;


import java.util.Scanner;

// Create simple method that takes as an argument String array
// Method must return total letters count in that array
// Ex: {"Ilyas", "Java", "C++"} => 12
public class Example03Methods {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.next();
        }
        System.out.println(countLetters(arr));
    }
    public static int countLetters(String[] texts) {
        int count = 0;
        for (int i = 0; i < texts.length; i++) {
            count = count + texts[i].length();
        }
        return count;
    }
}