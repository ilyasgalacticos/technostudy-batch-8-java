package week10.lesson2.example5;

public class Main {
    public static void main(String[] args) {

        SuperCar superCar = new SuperCar("Ferrari", 310);
        try{
            superCar.ride();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("OKAY");
        }
        System.out.println("I am done!");

    }
}
