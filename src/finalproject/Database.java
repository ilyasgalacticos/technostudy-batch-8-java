package finalproject;

import java.util.ArrayList;
import java.util.Date;

public class Database {

    private static ArrayList<BankAccount> accounts = new ArrayList<>();

    static {
        accounts.add(new NationalBankAccount("Ilyas Zhuanyshev", 3000, "USD0101112", "0102"));
        accounts.add(new NationalBankAccount("Ozgur Gogersin", 400000, "USD0101111", "0101"));
        accounts.add(new NationalBankAccount("Elvira Nazir", 10000, "USD0101113", "0103"));
        accounts.add(new NationalBankAccount("Cankut Sogancilar", 1000, "USD0101114", "0104"));
        accounts.add(new CityBankAccount("Cankut", "Sogancilar", 100000, "USD0101115", "0105"));
        accounts.add(new CityBankAccount("Ozgur", "Gogersin", 100, "USD0101116", "0106"));
        accounts.add(new CityBankAccount("Mesut", "Ozil", 10000000, "USD0101117", "0107"));
    }

    public static ArrayList<BankAccount> getAccounts(){
        return accounts;
    }
}
