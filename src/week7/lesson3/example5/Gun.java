package week7.lesson3.example5;

public class Gun {

    String name;
    int bulletsCapacity;
    int currentBullets;

    public Gun(){
        this.name = "Glock 17";
        this.bulletsCapacity = 20;
        this.currentBullets = 0;
    }

    public Gun(String name, int bulletsCapacity, int currentBullets){
        this.name = name;
        this.bulletsCapacity = bulletsCapacity;
        this.currentBullets = currentBullets;
    }

    public void printStatus() {
        System.out.println("..........................");
        System.out.println("Gun " + this.name + ", capacity: " + this.bulletsCapacity + " bullets");
        System.out.println("Current bullet amount: " + this.currentBullets + " bullets");
    }

}
