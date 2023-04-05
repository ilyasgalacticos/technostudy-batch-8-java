package week4.lesson3;

public class ArrayRepeat {
    public static void main(String[] args) {
        String[] names = new String[10]; // Creating new String array, you booked/reserved 10 places for texts
        String[] cities = {"Paris", "Madrid", "Barcelona", "Istanbul", "New York"}; // I created array with 5 elements
        //index   0        1           2          3           4

        System.out.println(cities[2]);
        cities[2] = "Frankfurt"; // I changed the value of 2nd index from Barcelona to Frankfurt
        System.out.println(cities[2]);

        //System.out.println(cities[-1]); Don't do this!, don't try this at home

        System.out.println(cities.length); // length of array will be printed


        String[] arrayOne = new String[10]; // default value of String is - null
        int[] arrayTwo = new int[10]; // default value of int is - 0
        double[] arrayThree = new double[10]; // default value of double is - 0.0
        boolean[] arrayFour = new boolean[10]; // default value of boolean is - false

        for (int i = 0; i < arrayOne.length; i++) {
            System.out.print(arrayOne[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < arrayTwo.length; i++) {
            System.out.print(arrayTwo[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < arrayThree.length; i++) {
            System.out.print(arrayThree[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < arrayFour.length; i++) {
            System.out.print(arrayFour[i] + " ");
        }
    }
}
