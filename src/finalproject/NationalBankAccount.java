package finalproject;

public class NationalBankAccount implements BankAccount{

    private String fullName;
    private int balance;
    private String accountNumber;
    private String pinCode;

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
        if(this.balance - credit > 0){
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
        builder.append(this.fullName);
        builder.append(", Account: ");
        builder.append(this.accountNumber);
        builder.append(", Balance: ");
        builder.append(this.balance);
        builder.append(" USD");
        return builder.toString();
    }
}
