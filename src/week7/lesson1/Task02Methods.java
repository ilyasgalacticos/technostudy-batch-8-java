package week7.lesson1;

public class Task02Methods {
    public static void main(String[] args) {
        int[] arr1 = {45, 67, 12, 23, 47, 98};
        int[] arr2 = {4, 1, 56, 34, 23, 78, 96, -6};

        printOdds(arr1);
        System.out.println();
        printOdds(arr2);
    }
    public static void printOdds(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 23) {
                break;
            }
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
