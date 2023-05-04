package week8.lesson4.example5;

public class RelativeContact extends Contact {

    private String relativeValue;

    public RelativeContact() {

    }

    public RelativeContact(String fullName, String phone, String relativeValue) {
        super(fullName, phone);
        this.relativeValue = relativeValue;
    }

    public String getRelativeValue() {
        return relativeValue;
    }

    public void setRelativeValue(String relativeValue) {
        this.relativeValue = relativeValue;
    }

    @Override
    public String getData(){
        return getFullName() + " - " + getRelativeValue() + " - " + getPhone();
    }
}
