package week9.lesson2.example6;

public class FifaGame extends Game{

    @Override
    public void left() {
        System.out.println("Footballer is turning left");
    }

    @Override
    public void right() {
        System.out.println("Footballer is turning right");
    }

    @Override
    public void down() {
        System.out.println("Footballer is running back");
    }

    @Override
    public void up() {
        System.out.println("Footballer is running forward");
    }

    @Override
    public void enter() {
        System.out.println("Footballer is shooting into goal");
    }
}
