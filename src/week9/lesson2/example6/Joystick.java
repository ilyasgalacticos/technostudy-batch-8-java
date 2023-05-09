package week9.lesson2.example6;

public class Joystick {

    private Game game;

    public Joystick(){
        this.game = null;
    }

    public Joystick(Game game) {
        this.game = game;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public void start(){
        System.out.println(game.getName() + " is starting");
    }
    public void enter(){
        game.enter();
    }
    public void moveUp(){
        game.up();
    }
    public void moveLeft(){
        game.left();
    }
    public void moveDown(){
        game.down();
    }
    public void moveRight(){
        game.right();
    }
}