package week9.lesson1.example5;

public class Accountant extends User{

    private String name;
    private String surname;
    private String category;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String getUserData() {
        return getName() + " " + getSurname() + " with category " + getCategory();
    }
}
