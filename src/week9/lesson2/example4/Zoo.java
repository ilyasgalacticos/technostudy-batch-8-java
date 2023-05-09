package week9.lesson2.example4;

public class Zoo {

    private String name;
    private Animal[] animals;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public void moveAll() {
        System.out.println("Zoo : " + getName() + " animals movement");
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i].getData() + " is going to move");
            animals[i].move();
            System.out.println("---------------------");
        }
    }
}
