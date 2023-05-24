package week11.lesson4.example2;

public class Main {

    public static void main(String[] args) {

        Person ilyas = new Person();
        ilyas.setFullName("Ilyas Zhuanyshev");
        ilyas.setZodiac(Zodiac.TWINS);

        Person ali = new Person();
        ali.setFullName("Ali Sancaktar");
        ali.setZodiac(Zodiac.CRAB);

        System.out.println(ilyas.getData());
        System.out.println(ali.getData());

    }
}
