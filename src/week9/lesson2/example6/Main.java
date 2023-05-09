package week9.lesson2.example6;

public class Main {
    public static void main(String[] args) {
        Joystick ps5Controller = new Joystick();

        FifaGame fifaGame = new FifaGame();
        fifaGame.setName("Fifa 23");

        GTAGame gta5 = new GTAGame();
        gta5.setName("GTA V");

        ps5Controller.setGame(fifaGame);
        ps5Controller.start();
        ps5Controller.moveUp();
        ps5Controller.moveDown();
        ps5Controller.moveLeft();
        ps5Controller.moveRight();
        ps5Controller.enter();

        ps5Controller.setGame(gta5);
        ps5Controller.start();
        ps5Controller.moveUp();
        ps5Controller.moveDown();
        ps5Controller.moveLeft();
        ps5Controller.moveRight();
        ps5Controller.enter();

    }
}
