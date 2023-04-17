package week6.lesson1;

import java.util.Scanner;

public class ExampleTask01RepeatString {
    // I am inputting text, print text in reverse order
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine(); // p r o g r a m m i n g - length = 11
                                     // 0 1 2 3 4 5 6 7 8 9 10

        for(int i = text.length()-1; i >= 0; i--){
            System.out.print(text.charAt(i));
        }

        System.out.println();
        char[] arr = text.toCharArray();
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[arr.length-i-1]);
        }

        System.out.println();
        for(int i = arr.length-1; i >=0 ; i--){
            System.out.print(arr[i]);
        }
    }
}
