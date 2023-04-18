package week6.lesson2;


public class Example03Methods {
    public static void printHello(){ // empty argument, non-argument method
        String text = "Hello";
        int amount = 50;
        for(int i = 0; i < amount; i++){
            System.out.println(text);
        }
    }
    public static void main(String[] args) { //main method, starting point
        printHello();
        printHello();
        printHello(); // autonomic methods
    }
}
