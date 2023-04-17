package week6.lesson1;

public class Example01RepeatString {
    public static void main(String[] args) {
        String text = "Ilyas From Almaty";
        char[] arr = text.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " . ");
        }

        System.out.println();

        for (int i = 0; i < text.length(); i++){
            System.out.print(text.charAt(i) + " - ");
        }
    }
}
