package finalproject;

public class CityBankAccount implements BankAccount {

    private String name;
    private String surname;
    private int balance;
    private String accountNumber;
    private String pinCode;

    public CityBankAccount(String name, String surname, int balance, String accountNumber, String pinCode) {
        this.name = name;
        this.surname = surname;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.pinCode = pinCode;
    }

    public CityBankAccount(){

    }

    @Override
    public String getAccountNumber() {
        return this.accountNumber;
    }

    @Override
    public String getPinCode() {
        return this.pinCode;
    }

    @Override
    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public int totalBalance() {
        return this.balance;
    }

    @Override
    public void creditBalance(int credit) {
        if (this.balance - credit > 0) {
            this.balance = this.balance - credit;
        }else{
            System.out.println("Insufficient money!");
        }
    }

    @Override
    public void debitBalance(int debit) {
        this.balance = this.balance + debit;
    }

    @Override
    public String accountData() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.name);
        builder.append(" ");
        builder.append(this.surname);
        builder.append(", Account: ");
        builder.append(this.accountNumber);
        builder.append(", Balance: ");
        builder.append(this.balance);
        builder.append(" USD");
        return builder.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
