package week6.lesson2;

// Create some method that returns you factorial of inputted number
public class Example06Methods {
    public static void main(String[] args) { //main method, starting point
        System.out.println(factorial(5));
        System.out.println(factorial(6));
        System.out.println(factorial(7));
        System.out.println(factorial(8));
    }

    public static int factorial(int num){
        int prod = 1;
        for(int i = 1; i <=num; i++){
            prod = prod * i;
        }
        return prod;
    }
}
