package day15_logicalops_switch_ternary;

public class JobOfferSelector {
    public static void main(String[] args) {
        boolean remote = false;
        boolean goodBenefits = true;
        double salary = 120_000;
        String location = "Honolulu";

        if (location.equals("Honolulu") && salary >= 120_000 && remote && goodBenefits){
            System.out.println("I will accept this offer");
        }else{
            System.out.println("Negotiate");
        }
    }
}
