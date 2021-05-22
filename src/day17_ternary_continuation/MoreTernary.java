package day17_ternary_continuation;

public class MoreTernary {
    public static void main(String[] args) {
        int hourlyRate = 35;
        String reply = (hourlyRate > 45) ? "accept" : "reject";
        System.out.println("reply = " + reply);

        String todaysClass = "java";

        String teacher = (todaysClass.equals("java")) ? "Saim|Murodil" : "Nadir";

        System.out.println("teacher = " + teacher);

        boolean isEligibleToDrive = true;
       // String driving; //"have DL and can drive"     "No DL, cannot drive"
        String driving = isEligibleToDrive ? "yes,have DL, Can drive" : "No DL, cannot drive";
        System.out.println("driving = " + driving);

    }
}
