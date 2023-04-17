package week6.lesson1;


public class Example09RepeatString {
    public static void main(String[] args) {
        String text = "I am Terminator T-800 I came from future come with me if you wanna live Sarah Conor";
        String[] arr = text.split(" ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i].charAt(0) + " ");
        }
    }
}
