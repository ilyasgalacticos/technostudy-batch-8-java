package week12.lesson3.example1;

public class Main {
    public static void main(String[] args) {
        String text = "Java";
        StringBuffer stringBuffer = new StringBuffer(text);

        System.out.println(stringBuffer.toString());

        stringBuffer.append(" Standard Edition");
        System.out.println(stringBuffer.toString());

        char []subStr = {' ', 'V','o','l',' ','2','.','0'};

        stringBuffer.append(subStr);
        System.out.println(stringBuffer.toString());
    }
}
