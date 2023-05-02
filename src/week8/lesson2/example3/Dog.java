package week8.lesson2.example3;

public class Dog extends Animal{
    private String barkStyle;
    private boolean vaccinated;

    public String getBarkStyle() {
        return barkStyle;
    }

    public void setBarkStyle(String barkStyle) {
        this.barkStyle = barkStyle;
    }

    public boolean isVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }

    public void eat(){
        System.out.println(
                "I am dog " + getName() + " "
                        + getAge() + " years old "
                        + getWeight() + " kg "
                        + "barking " + getBarkStyle());

        if(isVaccinated()){
            System.out.println("I am vaccinated");
        }else{
            System.out.println("I am not vaccinated");
        }
    }

}
