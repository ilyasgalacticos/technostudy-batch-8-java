package week12.lesson3.example2;

public class Main2 {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Hello Java Lesson");
        stringBuffer.replace(6, 10, "C#");
        System.out.println(stringBuffer.toString());
    }
}
