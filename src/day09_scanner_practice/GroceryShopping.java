package day09_scanner_practice;
import java.util.Scanner;

public class GroceryShopping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("how much did you pay for milk?");
        double milk= scan.nextDouble();

        System.out.println("how much did you pay for bread?");
        double bread = scan.nextDouble();

        System.out.println("how much did you pay for cucumber?");
        double cucumber = scan.nextDouble();


        double total =milk + bread + cucumber;



        System.out.println("So, you paid in total "+total);


    }
}
