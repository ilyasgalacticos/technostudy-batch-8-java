package week12.lesson3.example1;

public class Main5 {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Hello Java Developers");
        String sub1 = stringBuffer.substring(6);
        System.out.println(sub1);
        String sub2 = stringBuffer.substring(6, 15); // return substring from index [6, 15)
        System.out.println(sub2);
    }
}
