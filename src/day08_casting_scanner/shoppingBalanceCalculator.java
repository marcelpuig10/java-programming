package day08_casting_scanner;

public class shoppingBalanceCalculator {
    public static void main(String[] args) {
        double price1=20.88;
        double price2=89.99;
        double price3=15;
        double initialBalance=345.55;

        double remainingBalance=initialBalance-price1-price2-price3;

        System.out.println("Your remaining Balance is $"+remainingBalance);

        int balanceWithNoCents=(int)remainingBalance;
        System.out.println(balanceWithNoCents);



    }
}
