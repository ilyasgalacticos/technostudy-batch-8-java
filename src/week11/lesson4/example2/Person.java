package week11.lesson4.example2;

public class Person {

    private String fullName;
    private Zodiac zodiac;

    public Person(){

    }

    public Person(String fullName, Zodiac zodiac) {
        this.fullName = fullName;
        this.zodiac = zodiac;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Zodiac getZodiac() {
        return zodiac;
    }

    public void setZodiac(Zodiac zodiac) {
        this.zodiac = zodiac;
    }

    public String getData(){
        return this.fullName + " - " + this.zodiac.getLatinCode() + " " + this.zodiac.getZodiacCode();
    }
}
