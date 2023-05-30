package week12.lesson3.example1;

public class Main {
    public static void main(String[] args) {
        String text = "Java";
        StringBuffer stringBuffer = new StringBuffer(text);
        stringBuffer.append(" Standard Edition");
        String result = stringBuffer.toString();
        System.out.println(result);
    }
}
