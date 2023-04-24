package week7.lesson1;

//I will have 2d int array, print sum of all elements in each row
// Create a method that takes as an argument 2d int array
// Method will print sum of all numbers in each row in that array
public class Task06Methods {
    public static void main(String[] args) {

        int[][] nums = {
                {1, 5, 9, 99, 77},
                {12, 13, 14},
                {7, 8, 9, 10, 11, 12, 13, 14},
        };
        printSumRows(nums);
    }

    public static void printSumRows(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];
            }
            System.out.println(sum);
        }
    }
}