package week12.lesson3.example2;

public class Main {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Hello Java Enterprise Edition");
        stringBuffer.deleteCharAt(11);
        System.out.println(stringBuffer.toString());

        stringBuffer.insert(11, 'E');
        System.out.println(stringBuffer.toString());

        stringBuffer.delete(11, 22);
        System.out.println(stringBuffer.toString());

    }
}
