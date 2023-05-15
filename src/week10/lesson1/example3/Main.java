package week10.lesson1.example3;
public class Main {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        try {
            System.out.println(arr[10]);
        }catch (Exception e){
            System.out.println(e.getMessage());// return message error
        }
        System.out.println("Bye Bye");
    }
}
