package day18_conditions_practice_strings_intro;

public class EvenOrOdd {
    public static void main(String[] args) {
        //when number is divisable by 2 is even number(no remainder - 0)
        //odd number not divisable by 2 (remainder is 1)

        int num = 3 ;

        if (num % 2 == 0) {
            System.out.println(" Number is even");
        }else {
            System.out.println("Number is odd");
        }

    }
}
