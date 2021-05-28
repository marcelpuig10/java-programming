package day47_constructors;

public class AddressMain {
    public static void main(String[] args) {
        Address cybertekAddress = new Address(); //calling constructor
        Address myHome = new Address();

        cybertekAddress.setStreet("7925 Jones Branch Dr Suite 3300");
        cybertekAddress.setCity("McLean");
        cybertekAddress.setState("VA");
        cybertekAddress.setZipCode("22182");

        System.out.println("Cybertek address: " + cybertekAddress.toString());

        System.out.println(cybertekAddress);

        System.out.println(cybertekAddress.getCity());

        myHome.setStreet("12851 NW 11th street");
        myHome.setCity("Miami");
        myHome.setState("FL");
        myHome.setZipCode("33182");

        System.out.println("My home: " + myHome.toString());
    }
}
