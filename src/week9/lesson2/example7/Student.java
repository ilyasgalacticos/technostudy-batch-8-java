package week9.lesson2.example7;

public class Student {

    private String fullName;
    private String speciality;

    public Student() {
    }

    public Student(String fullName, String speciality) {
        this.fullName = fullName;
        this.speciality = speciality;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
