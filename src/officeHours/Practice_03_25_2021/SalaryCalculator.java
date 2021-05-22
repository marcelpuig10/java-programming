package officeHours.Practice_03_25_2021;

public class SalaryCalculator {
    public static void main(String[] args) {
        int hourlyRate = 10;
        int weeklyHours = 40;
        int numberOfWeeks = 52;

        boolean hourlyRateIsValid = hourlyRate > 0;
        boolean weeklyHoursAreValid = weeklyHours > 0 && weeklyHours <=65;
        boolean numberOfWeeksAreValid = numberOfWeeks >0 && numberOfWeeks <= 52;

        if(hourlyRateIsValid){
            if(weeklyHoursAreValid){
                if(numberOfWeeksAreValid){

                } else {
                    System.out.println("Salary is: " + (hourlyRate * weeklyHours  * numberOfWeeks));
             //   } else {
                    System.out.println("number of weeks cannot be less than 1 or greater than 52");
                }
            }
        }
    }
}
