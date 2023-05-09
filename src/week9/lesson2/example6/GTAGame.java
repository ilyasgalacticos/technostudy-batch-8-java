package week9.lesson2.example6;

public class GTAGame extends Game{

    @Override
    public void left() {
        System.out.println("CJ is running left");
    }

    @Override
    public void right() {
        System.out.println("CJ is running right");
    }

    @Override
    public void down() {
        System.out.println("CJ is running back");
    }

    @Override
    public void up() {
        System.out.println("CJ is running forward");
    }

    @Override
    public void enter() {
        System.out.println("CJ is sitting on car");
    }
}
