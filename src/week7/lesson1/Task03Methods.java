package week7.lesson1;

public class Task03Methods {
    public static void main(String[] args) {
        int arr1[] = {12, 45, 115, 678, 46, 34};
        int arr2[] = {12, 5, 95, 68, 123};
        System.out.println(getSumOfNonDivisibleByFive(arr1));
        System.out.println(getSumOfNonDivisibleByFive(arr2));
    }

    public static int getSumOfNonDivisibleByFive(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 5 != 0) {
                sum = sum + arr[i];
            }
        }
        return sum;
    }
}
