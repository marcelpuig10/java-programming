package day17_ternary_continuation;

public class AmazonPrimeShopping {
    public static void main(String[] args) {

        double price = 20;
        boolean isPrimeMember = false;

        if(isPrimeMember) {
            System.out.println("Free 2 day shipping eligible");
        }else {
            if (price >= 25) {
                System.out.println("Eligible for free regular shipping");
            }else {
                System.out.println("Not eligible for free shipping. Fee = $10");
            }
        }
    }
}
