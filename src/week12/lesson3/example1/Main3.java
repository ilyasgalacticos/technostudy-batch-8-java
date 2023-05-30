package week12.lesson3.example1;

public class Main3 {
    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer("Hello Java");
        stringBuffer.reverse();
        System.out.println(stringBuffer.toString());

        stringBuffer.setCharAt(3, 'M');
        System.out.println(stringBuffer.toString());
        stringBuffer.insert(3, 'X');
        System.out.println(stringBuffer.toString());

    }
}
