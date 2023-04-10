package week5.lesson1;

public class Array2DRepeat {
    public static void main(String[] args) {

        int arr[][] = {
                {1, 44, 9, 33, 0, 11}, // arr[0]
                {3, 12, 4, 10, 0, -11}, // arr[1]
                {6, 22, 4, 20, 7, 12}, // arr[2]
                {2, 79, 1, 50, 0, -9}, // arr[3]
                {8, 90, 6, 30, 7, 9} // arr[4]
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
