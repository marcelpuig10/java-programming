package day09_scanner_practice;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two numbers");

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int result = num1+num2;

        System.out.println("you enter "+ num1 +" and "+ num2);
        System.out.println("The result is "+ result);




    }
}
