package day09_scanner_practice;

public class CentsToDollars {
    public static void main(String[] args) {
        int cents = 597;
        int dollars = cents/100;
        int remainingCents = cents%100;
        System.out.println("cents = " + cents);
        System.out.println("dollars = " + dollars);
        System.out.println("remainingCents = " + remainingCents);
        System.out.println("in "+cents+" cents: "+dollars+" dollars "+remainingCents+" cents");
    }
}
