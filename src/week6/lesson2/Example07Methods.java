package week6.lesson2;

// Create some method that will return us multiplication of 2 numbers,
// without using * operator
public class Example07Methods {
    public static void main(String[] args) { //main method, starting point
        int x = getMult(4, 5);
        int y = getMult(9, 10);
        System.out.println(x);
        System.out.println(y);
        int total = getMult(x, y);
        System.out.println(total);
    }

    public static int getMult(int a, int b) {
        int sum = 0;
        for (int i = 0; i < a; i++) {
            sum = sum + b;
        }
        return sum;
    }
}
