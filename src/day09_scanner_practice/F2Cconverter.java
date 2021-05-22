package day09_scanner_practice;

import java.util.Scanner;

public class F2Cconverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter temperature in Farenheit: ");

        int tempInF = scan.nextInt();

        int tempInC= (tempInF-32)*5/9;

        System.out.println("The temperature in Celsius is: "+tempInC);
    }
}
