package week6.lesson1;

public class ExampleTask02RepeatString {
    // I am inputting text, and replace all vowels (a, e, i, o, u) into 'x' symbol
    public static void main(String[] args) {

        String text = "I am John Conor came from future, come with me if you wanna live";

        text = text.toLowerCase(); // I am changing everything into lower case
        char[] arr = text.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'o' || arr[i]== 'i' || arr[i]== 'u'){
                arr[i] = 'x';
            }
        }
        text = new String(arr);
        System.out.println(text);
    }
}
