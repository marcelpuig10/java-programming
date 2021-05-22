package Replits;

import java.util.Scanner;

public class phoneNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter area code and phone number:");
        int areaCode=scan.nextInt();
        System.out.println("enter number" );
        int localNumber=scan.nextInt();

        String phoneNumber;
        //WRITE YOUT CODE HERE:

        phoneNumber = "(" + areaCode +")-" + localNumber;

        System.out.println("Calling number "+phoneNumber);
    }
}
