package day09_scanner_practice;

import java.util.Scanner;

public class Miles2KmConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter miles:" );

        int miles= scan.nextInt();

        double totalKm= miles * 1.609;

        System.out.println("Total en Km: "+ totalKm);
    }
}
