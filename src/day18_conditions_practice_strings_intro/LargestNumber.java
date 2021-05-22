package day18_conditions_practice_strings_intro;

public class LargestNumber {
    public static void main(String[] args) {
        int num1 = 5, num2 = 5, num3 = 3;

        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + " largest number");
        }else if (num2 >= num1 && num2 >= num3){
            System.out.println(num2 + " largest number");
        }else{
            System.out.println(num3 + " is the largest");
        }
    }
}
