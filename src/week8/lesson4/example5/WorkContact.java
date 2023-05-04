package week8.lesson4.example5;

public class WorkContact extends Contact{

    private String department;

    public WorkContact() {

    }

    public WorkContact(String fullName, String phone, String department) {
        super(fullName, phone);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String getData(){
        return getFullName() + " - " + getDepartment() + " - " + getPhone();
    }
}
