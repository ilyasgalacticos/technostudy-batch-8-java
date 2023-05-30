package week12.lesson3.example1;

public class Main4 {
    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer("Java Enterprise Edition");
        char[] array = new char[30];
        array[0] = 'M';
        array[1] = 'y';
        array[2] = ' ';

        stringBuffer.getChars(5, 15, array, 3);
        for(char c : array){
            System.out.println(c);
        }
    }
}
