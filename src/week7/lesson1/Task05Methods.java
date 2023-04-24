package week7.lesson1;

public class Task05Methods {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {1, 0, 4, 5, 0, 7};
        System.out.println(countNonZeroElements(arr1));
        System.out.println(countNonZeroElements(arr2));
    }

    public static int countNonZeroElements(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                count++;
            }
        }
        return count;
    }
}