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
        this.name = name; //this class' name is equal to our temporary name
        this.bulletsCapacity = bulletsCapacity;
        this.currentBullets = currentBullets;
    }

    public void printStatus() {
        System.out.println("..........................");
        System.out.println("Gun " + this.name + ", capacity: " + this.bulletsCapacity + " bullets");
        System.out.println("Current bullet amount: " + this.currentBullets + " bullets");
    }

    public void shot() {
        System.out.println("..........................");
        if (this.currentBullets > 0) {
            System.out.println("Baaaam!");
            this.currentBullets = this.currentBullets - 1;
        }else{
            System.out.println("Shell is empty!");
        }
    }

    public void reload() {
        System.out.println("..........................");
        if (this.currentBullets < this.bulletsCapacity) {
            this.currentBullets = this.currentBullets + 1;
            System.out.println("Reloading... Added 1 bullet");
            System.out.println("Currently " + this.currentBullets + " bullets");
        } else {
            System.out.println("Shell is full");
        }
    }

}
