package week12.lesson1.example1;

import java.time.LocalDate;

public class Student {

    private String fullName;
    private String city;
    private LocalDate birthdate;
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return this.fullName + " from " + this.city + " was born in " + this.birthdate;
    }
}
