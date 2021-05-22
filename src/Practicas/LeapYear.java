package Practicas;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2019;
        int result = year%4;

        if(result == 0){
            System.out.println(year + " is leap year");
        }else{
            System.out.println(year + " is not a leap year");
        }
    }
}
