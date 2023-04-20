package week6.lesson4;

public class Example01Methods {
    public static void main(String[] args) {

        System.out.println(getMax(5, 10));

    }
    public static int getMax(int a, int b){
        if(a > b){
            return a;
        }else{
            return b;
        }
    }
}