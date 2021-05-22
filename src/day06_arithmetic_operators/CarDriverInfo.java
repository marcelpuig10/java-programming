package day06_arithmetic_operators;

public class CarDriverInfo {
    public static void main(String[] args) {
        String carModel="BMW X6";
        String driverName="Ana";
        String licenseNum="P123456987";
        int speed=200;
        boolean auotmatic=true;

        System.out.println("I have a "+carModel+", my name is "+driverName+", my license number is "+licenseNum+"\nI was driving "+speed+"mph. Is my car automatic? "+auotmatic);

        carModel="Hyundai";
        driverName="Joe";
        licenseNum="w987456321";
        speed=40;
        auotmatic=false;

        System.out.println();

        System.out.println(10+5);

        System.out.println("I have a "+carModel+", my name is "+driverName+", my license number is "+licenseNum+"\nI was driving "+speed+"mph. Is my car automatic? "+auotmatic);




    }
}
