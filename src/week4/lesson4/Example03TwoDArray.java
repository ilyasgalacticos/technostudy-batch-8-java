package week4.lesson4;

public class Example03TwoDArray {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5}, {34, 55, 89, 90}};
//        System.out.println(arr[0][0]);
//        System.out.println(arr[0][1]);
//        System.out.println(arr[0][2]);
//        System.out.println(arr[1][0]);
//        System.out.println(arr[1][1]);
//        System.out.println(arr[2][0]);
//        System.out.println(arr[2][1]);
//        System.out.println(arr[2][2]);
//        System.out.println(arr[2][3]);

        System.out.println("Length of main array is " + arr.length);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++){
                System.out.println(arr[i][j]);
            }
        }
    }
}
