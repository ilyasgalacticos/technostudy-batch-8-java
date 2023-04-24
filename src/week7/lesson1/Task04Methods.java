package week7.lesson1;

public class Task04Methods {
    public static void main(String[] args) {
        checkEven(5);
        checkEven(6);
        checkEven(77);
        checkEven(21);
        checkEven(87);
    }

    public static void checkEven(int num){
        if(num%2==0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}