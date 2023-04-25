package week7.lesson2.example1;

public class Main {
    public static void main(String[] args) {
        Human messi = new Human(); // I created new object of Human class
        // messi - is Object
        // Human - is Class
        messi.fullName = "Leo Messi";
        messi.country = "Argentina";
        messi.eyes = "black";
        messi.job = "Football";
        messi.height = 169;
        messi.gender = "Male";
        messi.longHairs = true;

        Human novak = new Human();
        novak.fullName = "Novak Djokovic";
        novak.gender = "Male";
        novak.eyes = "blue";
        novak.job = "Tennis";
        novak.height = 187;
        novak.longHairs = false;
        novak.country = "Serbia";

        System.out.println(messi.fullName + " from " + messi.country);
        System.out.println(novak.fullName + " from " + novak.country);

    }
}
