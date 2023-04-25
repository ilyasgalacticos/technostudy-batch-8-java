package week7.lesson2.example5fifa;

public class Player {
    String fullName;
    String country;
    int age;
    int height;
    String position;
    double power;
    double stamina;
    double speed;

    String getData() {
        return "Full Name : " + fullName + "\n"
                + "Country : " + country + "\n"
                + "Age : " + age + " years old\n"
                + "Height : " + height + " cm\n"
                + "Position : " + position + "\n"
                + "Power : " + power + "\n"
                + "Stamina : " + stamina + "\n"
                + "Speed : " + speed;
    }
}
