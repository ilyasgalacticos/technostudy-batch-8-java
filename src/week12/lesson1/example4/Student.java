package week12.lesson1.example4;

import java.time.LocalDate;
import java.time.Period;

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

    public String getAge() {
        Period period = Period.between(this.birthdate, LocalDate.now());
        String age = period.getYears() + " years, "
                + period.getMonths() + " month and " + period.getDays() + " days";
        return age;
    }

    @Override
    public String toString() {
        return this.fullName + " from " + this.city + " " + getAge() + " age";
    }
}
