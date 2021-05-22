package day16_switch_ternary;

public class AdaieApartments {
    public static void main(String[] args) {
        System.out.println("WELCOME TO ADAIRE APARTMENTS");

        int numOfBedrooms=5;
        double startingPrice= 0;

        switch (numOfBedrooms) {
            case 0:
                System.out.println("Studio Apartment selected");
                startingPrice = 1454.0;
                System.out.println("startingPrice = " + startingPrice);
                break;
            case 1:
                System.out.println("One bedroom apartment selected");
                startingPrice = 1725;
                System.out.println("startingPrice = " + startingPrice);
                break;
            case 2:
                System.out.println("Two bedrooms apartment selected");
                startingPrice = 1899;
                System.out.println("startingPrice = " + startingPrice);
                break;
            default:
                System.out.println("no matching");
                break;

        }
    }
}
