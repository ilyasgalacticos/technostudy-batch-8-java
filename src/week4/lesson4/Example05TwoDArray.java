package week4.lesson4;

public class Example05TwoDArray {
    public static void main(String[] args) {
        int[][] arr = new int[10][20];

        arr[0][4] = 1;
        arr[4][2] = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
