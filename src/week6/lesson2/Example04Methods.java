package week6.lesson2;


public class Example04Methods {
    public static void main(String[] args) { //main method, starting point
        int res = getSum(1,4,7);
        System.out.println(res);
    }
    public static int getSum(int a, int b, int c) {
        return a + b + c;
    }
}
