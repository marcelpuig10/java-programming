package day18_conditions_practice_strings_intro;

public class FizzBuzz {
    public static void main(String[] args) {
        //Fizz when is divisible by 3
        //Buzz when is divisible by 5
        //FizzBuzz when is divisible by 3 and/or 5

        int num=7;

        if( num % 3 ==0 && num % 5 ==0) {
            System.out.println("FizzBuzz");
        }else if (num % 3 ==0){
            System.out.println("Fizz number");
        }else if (num % 5 ==0){
            System.out.println("Buzz");
        }else{
            System.out.println("not");
        }


    }
}
