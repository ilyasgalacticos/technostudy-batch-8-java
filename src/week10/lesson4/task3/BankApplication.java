package week10.lesson4.task3;

import java.util.ArrayList;

public class BankApplication {

    private String name;
    private ArrayList<Account> accounts = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addAccount(Account account) {
        this.accounts.add(account);
    }

    public void removeAccount(int index) {
        this.accounts.remove(index);
    }

    public Account getMaxAccount() {
        Account max = this.accounts.get(0);
        for (int i = 1; i < this.accounts.size(); i++) {
            if (max.getBalance() < this.accounts.get(i).getBalance()) {
                max = this.accounts.get(i);
            }
        }
        return max;
    }

    public double getTotalBalance() {
        double total = 0;
        for (Account acc : accounts) {
            total = total + acc.getBalance();
        }
        return total;
    }

    public double getAverageBalance() {
        return getTotalBalance() / totalAccounts();
    }

    public int totalAccounts() {
        return this.accounts.size();
    }

    public String getBankData() {
        String result = "";
        result += "BANK NAME : " + this.name + "\n";
        result += "TOTAL ACCOUNTS : " + totalAccounts() + "\n";
        result += "TOTAL BALANCE : " + getTotalBalance() + " USD" + "\n";
        result += "AVERAGE VALUE OF BALANCE : " + getAverageBalance() + " USD" + "\n";
        return result;
    }
}
