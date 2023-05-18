package week10.lesson4.task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        BankApplication worldBank = new BankApplication();
        worldBank.setName("World Bank Inc.");
        BankApplication hsbcBank = new BankApplication();
        hsbcBank.setName("HSBC BANK");
        BankApplication santanderBank = new BankApplication();
        santanderBank.setName("Santander Espana");

        worldBank.addAccount(new Account(1000001, "Ilyas", "Zhuanyshev", 40000));
        worldBank.addAccount(new Account(1000002, "Messi", "Zhuanyshev", 30000));
        worldBank.addAccount(new Account(1000003, "Cristiano", "Zhuanyshev", 5990000));
        worldBank.addAccount(new Account(1000004, "Sabri", "Zhuanyshev", 10000));
        worldBank.addAccount(new Account(1000005, "Jack", "Zhuanyshev", 20000));
        worldBank.addAccount(new Account(1000006, "Luis", "Zhuanyshev", 80000));
        worldBank.addAccount(new Account(1000007, "Hasan", "Zhuanyshev", 90000));
        worldBank.addAccount(new Account(1000008, "Hakan", "Zhuanyshev", 5000));
        worldBank.addAccount(new Account(1000009, "Arman", "Zhuanyshev", 4000));
        worldBank.addAccount(new Account(1000010, "Mark", "Zhuanyshev", 1000));

        hsbcBank.addAccount(new Account(2000001, "Ozgur", "Gogersin", 4000));
        hsbcBank.addAccount(new Account(2000002, "Hasan", "Gogersin", 7000));
        hsbcBank.addAccount(new Account(2000003, "Murat", "Gogersin", 90000));
        hsbcBank.addAccount(new Account(2000004, "Mehmet", "Gogersin", 100000));
        hsbcBank.addAccount(new Account(2000005, "Suleyman", "Gogersin", 1000));
        hsbcBank.addAccount(new Account(2000006, "Umit", "Gogersin", 500));
        hsbcBank.addAccount(new Account(2000007, "Ali", "Gogersin", 44000));
        hsbcBank.addAccount(new Account(2000008, "Cankut", "Gogersin", 45000));
        hsbcBank.addAccount(new Account(2000009, "Ilyas", "Gogersin", 4997000));
        hsbcBank.addAccount(new Account(2000010, "Ismail", "Gogersin", 41000));

        santanderBank.addAccount(new Account(3000001, "Cankut", "Sogancilar", 50000));
        santanderBank.addAccount(new Account(3000002, "Harun", "Sogancilar", 100000));
        santanderBank.addAccount(new Account(3000003, "Fatih", "Sogancilar", 80000));
        santanderBank.addAccount(new Account(3000004, "Selim", "Sogancilar", 7000));
        santanderBank.addAccount(new Account(3000005, "Elvira", "Sogancilar", 5000000));
        santanderBank.addAccount(new Account(3000006, "Zhazira", "Sogancilar", 300000));
        santanderBank.addAccount(new Account(3000007, "Luba", "Sogancilar", 1500000));
        santanderBank.addAccount(new Account(3000008, "Madina", "Sogancilar", 10000));
        santanderBank.addAccount(new Account(3000009, "Merve", "Sogancilar", 80000));
        santanderBank.addAccount(new Account(3000010, "Bahar", "Sogancilar", 90000));

        santanderBank.removeAccount(4);

        ArrayList<BankApplication> bankApplications = new ArrayList<>();
        bankApplications.add(worldBank);
        bankApplications.add(hsbcBank);
        bankApplications.add(santanderBank);

        for (BankApplication b : bankApplications) {
            System.out.println(b.getBankData());
        }

        for (BankApplication b : bankApplications) {
            System.out.println(b.getMaxAccount());
        }

        System.out.println("##### AFTER REMOVING #####");

        bankApplications.remove(0);

        for (BankApplication b : bankApplications) {
            System.out.println(b.getBankData());
        }

        for (BankApplication b : bankApplications) {
            System.out.println(b.getMaxAccount());
        }

    }
}
