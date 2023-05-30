package week12.lesson3.example1;

public class Main2 {
    public static void main(String[] args) {

        String name = "John";
        String surname = "Smith";
        String city = "Los Angeles";

        StringBuffer stringBuffer = new StringBuffer(name);
        stringBuffer.append(" ");
        stringBuffer.append(surname);
        stringBuffer.append(" from ");
        stringBuffer.append(city);

        stringBuffer.insert(0, "Terminator ");

        System.out.println(stringBuffer.toString());
    }
}
