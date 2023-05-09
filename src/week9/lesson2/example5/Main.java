package week9.lesson2.example5;

public class Main {
    public static void main(String[] args) {
        A a2 = new A(){
            @Override
            public String a() {
                return "text";
            }
        }; //anonymous class
        B b = new B();
    }
}
