package week12.lesson4.example1;

public class Main2 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] arr = {'H', 'e', 'l', 'l', 'o'};
        stringBuilder.append(arr);
        stringBuilder.append(" World");
        System.out.println(stringBuilder.toString());

        stringBuilder.insert(0, "Java ");
        System.out.println(stringBuilder.toString());

        stringBuilder.insert(10, 'X');
        System.out.println(stringBuilder.toString());

    }
}
