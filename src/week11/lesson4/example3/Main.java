package week11.lesson4.example3;

public class Main {

    public static void main(String[] args) {
        MathOperation op = MathOperation.SUM;
        System.out.println(op.getOperationSign() + " is " + op.doOperation(10, 20));
        op = MathOperation.DIVIDE;
        System.out.println(op.getOperationSign() + " is " + op.doOperation(100, 4));
    }
}
