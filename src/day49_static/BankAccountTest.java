package day49_static;

import officeHours.Practice_05_11_2021.BankAccount;

public class BankAccountTest {
    public static void main(String[] args) {
        MyBankAccount husband = new MyBankAccount();
        husband.user = "husband";
        husband.showBalance();
        husband.spend(100.0);
        husband.showBalance();

        MyBankAccount wife = new MyBankAccount();
        wife.user ="wife";
        wife.showBalance();
        wife.spend(400);
        husband.showBalance();
        wife.showBalance();
    }
}
