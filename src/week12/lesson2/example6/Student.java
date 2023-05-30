package week12.lesson2.example6;

import java.util.Date;

public class Student {

    private String fullName;
    private String city;
    private Date birthdate;

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

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return this.fullName + " " + this.city + " " + this.birthdate;
    }
}
