package day12_conditional_statements;

import java.util.Scanner;

public class AmazonFreeShipping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Total Price");

        double totalPrice = scan.nextDouble();

        if(totalPrice >=25.0){
            System.out.println("FREE SHIPPING ELIGIBLE. yOUR ORDER TOTAL: $"+totalPrice);

        }else {
            System.out.println("NOT ELIGIBLE FOR FREE SHIPPING.YOUR ORDER TOTAL: $");
        }

        System.out.println("THANK YOU FOR SHOPPING WITH US");

    }
}
