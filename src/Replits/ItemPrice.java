package Replits;

import sun.security.x509.InvalidityDateExtension;

import java.util.Scanner;

public class ItemPrice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter item1 and price1");
        String item1 = scan.next();
        double price1 = scan.nextDouble();

        System.out.println("Enter item2 and price2");
        String item2 = scan.next();
        double price2 = scan.nextDouble();

        System.out.println("Enter item3 and price3");
        String item3 = scan.next();
        double price3 = scan.nextDouble();

        double totalPrice = price1 + price2 + price3;

        System.out.println("Item1: "+ item1 + " price: "+ price1 + " Item2: "+ item2+ " price: "+ price2+ " Item3: "+
                item3+ " price: "+price3+ " totalPrice = " + totalPrice);

    }
}
