package day15_logicalops_switch_ternary;

public class AndOperatorPractice {
    public static void main(String[] args) {
        boolean onSale = true;
        boolean freeShipping = true;
        String itemName = "wooden spoon";

        if(onSale && freeShipping){
            System.out.println("Add "+ itemName + " to cart");
        }else {
            System.out.println("Not buying");
        }

        //add to cart only when is freeShipping, onSale and woodenSpoon

        if(freeShipping && onSale && itemName.equals("wooden spoon")){
            System.out.println("add to cart");
        }else {
            System.out.println("not buying");
        }

    }
}
