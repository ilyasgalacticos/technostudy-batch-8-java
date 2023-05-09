package week9.lesson2.example5;

public class Z extends Y{

    @Override
    public void x() {
        System.out.println("I am modified by Z");
        super.x();
    }
}
