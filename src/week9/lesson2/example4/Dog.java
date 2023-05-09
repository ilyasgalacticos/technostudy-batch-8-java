package week9.lesson2.example4;

public class Dog extends Animal{

    private String nick;
    private String barkingSound;
    private String type;

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getBarkingSound() {
        return barkingSound;
    }

    public void setBarkingSound(String barkingSound) {
        this.barkingSound = barkingSound;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getData() {
        return getNick() + " " + getType() + " - " + getBarkingSound();
    }

    @Override
    public void move() {
        System.out.println("I am dog " + getNick() + " " + getBarkingSound());
    }
}
