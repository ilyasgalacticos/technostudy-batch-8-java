package week6.lesson4;

/*
    Create a method that takes an integer as an argument, then draws square of "#" symbol

    Input
    5

    Output
    # # # # #
    # # # # #
    # # # # #
    # # # # #
    # # # # #

    Input
    2

    Output
    # #
    # #

 */
public class Task05Methods {
    public static void main(String[] args) {
        printSquare(5);
        printSquare(10);
        printSquare(15);
        printSquare(20);
    }

    public static void printSquare(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}