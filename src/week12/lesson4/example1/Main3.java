package week12.lesson4.example1;

public class Main3 {
    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hello Java");
        stringBuilder.reverse();
        System.out.println(stringBuilder.toString());
        stringBuilder.reverse();
        System.out.println(stringBuilder.toString());


        stringBuilder.replace(6, 10, "C++");
        System.out.println(stringBuilder.toString());

    }
}
