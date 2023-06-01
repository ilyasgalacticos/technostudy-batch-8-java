package finalproject;

import java.util.Scanner;

public class CityBankATM {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to City Bank ATM!");

        while (true) {

            System.out.println("INSERT ACCOUNT NUMBER:");
            String account = in.next();
            System.out.println("INSERT PIN CODE:");
            String pinCode = in.next();

            BankAccount bankAccount = Database.getAccount(account);

            if (bankAccount != null && bankAccount.getPinCode().equals(pinCode)) {

                if (bankAccount instanceof CityBankAccount) {

                    while (true) {

                        System.out.println("PRESS [1] TO CASH WITHDRAWAL");
                        System.out.println("PRESS [2] TO VIEW BALANCE");
                        System.out.println("PRESS [3] TO CHANGE PIN CODE");
                        System.out.println("PRESS [4] TO CASH IN ACCOUNT");
                        System.out.println("PRESS [5] TO VIEW ACCOUNT DATA");
                        System.out.println("PRESS [0] TO EXIT");
                        String choice = in.next();

                        if (choice.equals("1")) {
                            try {

                                System.out.println("Insert amount to cash withdrawal:");
                                int amount = in.nextInt();
                                bankAccount.creditBalance(amount);

                            } catch (Exception e) {
                                System.out.println("Incorrect input! Use numbers!");
                            }

                        } else if (choice.equals("2")) {

                            System.out.println(bankAccount.totalBalance() + " USD left!");

                        } else if (choice.equals("3")) {

                            System.out.println("Insert old PIN CODE:");
                            String oldPin = in.next();

                            System.out.println("Insert new PIN CODE:");
                            String newPin = in.next();

                            System.out.println("Repeat new PIN CODE:");
                            String reNewPin = in.next();

                            if (oldPin.equals(bankAccount.getPinCode())) {
                                if (newPin.equals(reNewPin)) {
                                    bankAccount.setPinCode(newPin);
                                    System.out.println("PIN CODE Changed Successfully!");
                                } else {
                                    System.out.println("New PIN CODES are not same!");
                                }
                            } else {
                                System.out.println("Incorrect old PIN CODE!");
                            }

                        } else if(choice.equals("4")){

                            try{

                                System.out.println("Insert amount to cash in (USD):");
                                int amount = in.nextInt();
                                bankAccount.debitBalance(amount);
                                System.out.println("Your cash in operation completed!");

                            }catch (Exception e){
                                System.out.println("Insert correct number!");
                            }

                        } else if (choice.equals("5")) {

                            System.out.println(bankAccount.accountData());

                        } else if (choice.equals("0")) {

                            break;

                        } else {
                            System.out.println("Incorrect Command!");
                        }
                    }

                } else {

                    while (true) {

                        System.out.println("PRESS [1] TO CASH WITHDRAWAL");
                        System.out.println("PRESS [2] TO VIEW BALANCE");
                        System.out.println("PRESS [0] TO EXIT");

                        String choice = in.next();

                        if (choice.equals("1")) {
                            try {

                                System.out.println("Insert amount to cash withdrawal:");
                                int amount = in.nextInt();
                                bankAccount.creditBalance(amount + 3);

                            } catch (Exception e) {
                                System.out.println("Incorrect input! Use numbers!");
                            }

                        } else if (choice.equals("2")) {

                            System.out.println(bankAccount.totalBalance() + " USD left!");

                        } else if (choice.equals("0")) {

                            break;

                        } else {
                            System.out.println("Incorrect Command!");
                        }
                    }
                }

            } else {
                System.out.println("Incorrect Account Number or PIN Code");
            }

        }
    }

}
