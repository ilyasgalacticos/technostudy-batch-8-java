package week7.lesson1;

public class Example01Methods {

    // print all array's elements in argument of method

    public static void main(String[] args) {
        int[] array = {10, 20, 50, 100, -54, -7};
        printData(array);
    }

    public static void printData(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
