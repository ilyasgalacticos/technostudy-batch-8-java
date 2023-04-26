package week7.lesson3.example4;

public class Gun {

    String name;
    int bulletsCapacity;
    int currentBullets;

    //Constructor's name is Gun()
    // Default constructor, constructor doesn't have arguments
    public Gun(){
        name = "Glock 17";
        bulletsCapacity = 15;
        currentBullets = 7;
    }

    // Parametrized constructor
    public Gun(String n, int b, int c){
        name = n;
        bulletsCapacity = b;
        currentBullets = c;
    }

    public void printStatus() {
        System.out.println("..........................");
        System.out.println("Gun " + name + ", capacity: " + bulletsCapacity + " bullets");
        System.out.println("Current bullet amount: " + currentBullets + " bullets");
    }

}
