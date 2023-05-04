package week8.lesson4.example5;

public class Contact {

    private String fullName;
    private String phone;

    public Contact(){

    }

    public Contact(String fullName, String phone) {
        this.fullName = fullName;
        this.phone = phone;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getData(){
        return this.fullName + " - " + this.phone;
    }
}
