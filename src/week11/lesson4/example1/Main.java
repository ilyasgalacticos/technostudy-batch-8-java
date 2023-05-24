package week11.lesson4.example1;

public class Main {
    public static void main(String[] args) {

        FacebookUser user = new FacebookUser();
        user.setEmail("ilyas@gmail.com");
        user.setCountry("Kazakhstan");
        user.setFullName("Ilyas Zhuanyshev");
        user.setGender(Gender.MALE);
        user.setStatus(Status.MARRIED);

        FacebookUser ali = new FacebookUser();
        ali.setEmail("ali@gmail.com");
        ali.setCountry("Turkey");
        ali.setFullName("Ali Sancaktar");
        ali.setGender(Gender.MALE);
        ali.setStatus(Status.ENGAGED);

        FacebookUser caroline = new FacebookUser();
        caroline.setEmail("caroline@gmail.com");
        caroline.setFullName("Caroline Arantes");
        caroline.setGender(Gender.FEMALE);
        caroline.setStatus(Status.MARRIED);
        caroline.setCountry("Germany");

        ali.printData();
        caroline.printData();
        user.printData();

    }
}
