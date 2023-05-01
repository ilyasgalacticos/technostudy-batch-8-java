package week8.lesson1.example8;

public class Main {
    public static void main(String[] args) {

        SSDDisk toshiba = new SSDDisk();
        toshiba.setName("TOSHIBA");
        toshiba.setVolume(500);
        toshiba.setPrice(200);

        SSDDisk lenovo = new SSDDisk();
        lenovo.setName("Lenovo");
        lenovo.setVolume(1000);
        lenovo.setPrice(300);

        Laptop asus = new Laptop();
        asus.setName("ASUS");
        asus.setModel("TUF GAMING");
        asus.setPrice(1000);
        asus.setRam(8);
        asus.setSsdDisk(toshiba);

        asus.executeLaptop();

        System.out.println("--------------------");

        asus.setSsdDisk(lenovo);

        asus.executeLaptop();

        int price = asus.getPrice() + asus.getSsdDisk().getPrice();

        System.out.println(price + " USD");

    }
}
