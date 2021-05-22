package day24_loops;
import java.util.Random;
import java.util.Scanner;
public class GuessTheNumberGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        int secretNumber = random.nextInt(101);
        int guessingNumber = 0;

        do{
            System.out.println("Guess secret number");
            guessingNumber= scan.nextInt();

            if(guessingNumber>secretNumber){
                System.out.println("wrong your number is larger");
            }else{
                System.out.println("wrong is too small");
            }
        }while(secretNumber != guessingNumber);
        System.out.println("you won!" + guessingNumber);


    }
}
