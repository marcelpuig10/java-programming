package officeHours.Practice_03_03_2021;
/*
Make a class AgeToDays
create a main method

    - Declare two int variables: age and age in days

    - Use a base of 365 days in a year

    - Calculate and display:
        You are $age years old! That means you are $days days old

 */
public class ageToDays {
    public static void main(String[] args) {
        int age=5;
        int ageInDays= age*365;

        System.out.println("You are "+age+" years old! That means you are "+ageInDays+" days old");



    }
}
