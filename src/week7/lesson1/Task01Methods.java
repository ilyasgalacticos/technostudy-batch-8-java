package week7.lesson1;

public class Task01Methods {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 55, 77, 67, 21, 12, 54};
        System.out.println(getMean(arr)); //72 + 54 = 126 => 126/5 = 24 + 1.2 = 25.2
    }

    public static double getMean(int[] array) {
        double sum = 0;
        double amount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sum = sum + array[i];
                amount = amount + 1;
            }
        }
        return sum / amount;
    }
}
