package day46_encapsulation;

public class CapitalOne {
    public static void main(String[] args) {
        CheckingAccount acc = new CheckingAccount();
        //acc.accountNumber = 431154324213L;
        acc.setAccountNumber(431154324213L);
        acc.setBalance(250.50);
        acc.setAccountHolder("John Smith");
    }
}
