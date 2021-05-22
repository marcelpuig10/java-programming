package day15_logicalops_switch_ternary;

public class UsedCarSelector {
    public static void main(String[] args) {
        double budget = 5_000;
        String model = "Tesla";
        double price = 4999;

        if (price <=  budget && (model.equals("Toyota")||model.equals("Honda") || model.equals("Tesla"))) {
            System.out.println("Ready to purchase car: "+ model + " for "+ price);

        }else {
            System.out.println("not under my requirements");
        }
    }
}
