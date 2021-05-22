package day15_logicalops_switch_ternary;

public class NotLogicalOperator {
    public static void main(String[] args) {
        System.out.println("!true = "+ (!true));
        System.out.println("!false= "+ (!false));



        int age =8;

        if (!(age > 7)){
            System.out.println("needs to seat in carseat");
        }else {
            System.out.println("can seat in normal seat");
        }


        boolean isSmokingAllowed = true;

        if (!isSmokingAllowed){
            System.out.println("Smoking is not allowed.Exit");
        }else {
            System.out.println("somking area");
        }

        boolean isAffordable = false;
         if (!isAffordable){
             System.out.println("buy it");
         }else {
             System.out.println("dont buy");
         }
    }

}
