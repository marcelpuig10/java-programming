package day36_methodsWithReturn;

public class CreditScore {
    public static void main(String[] args) {
        checkEligible(500);
        checkEligible(850);
        checkEligible(400);
        //System.out.println(checkEligible(400)); ERROR CANNOT PRINT VOID METHOD
        System.out.println(getCreditScore());
        System.out.println("credit score = "+ getCreditScore());
        int score = getCreditScore();
        System.out.println("score = " + score);

    }

    public static void checkEligible(int creditScore) {
        if(creditScore >= 700) {
            System.out.println("Eligible for leasing this car");
        }else {
            System.out.println("Sorry, you are not eligible for leasing this car");
        }
    }

    public static int getCreditScore(){
        return 800;
    }
}
