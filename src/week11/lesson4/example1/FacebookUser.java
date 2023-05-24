package week11.lesson4.example1;

public class FacebookUser {

    private String email;
    private String fullName;
    private String country;
    private Status status;
    private Gender gender;

    public FacebookUser(String email, String fullName, String country, Status status, Gender gender) {
        this.email = email;
        this.fullName = fullName;
        this.country = country;
        this.status = status;
        this.gender = gender;
    }

    public FacebookUser() {

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "FacebookUser{" +
                "email='" + email + '\'' +
                ", fullName='" + fullName + '\'' +
                ", country='" + country + '\'' +
                ", status=" + status +
                ", gender=" + gender +
                '}';
    }

    public String getData(){
        return this.email + " " + this.fullName + " from " + this.country
                + " " + this.gender + " status: " + this.status;
    }

    public void printData(){
        if(this.gender==Gender.MALE){
            System.out.println("Mr. " + getData());
        }else if(this.gender==Gender.FEMALE){
            System.out.println("Ms. " + getData());
        }else if(this.gender==Gender.OTHER){
            System.out.println("Dear " + getData());
        }
    }
}
