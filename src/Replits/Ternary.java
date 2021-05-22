package Replits;
import java.util.Scanner;
public class Ternary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter one number");
        int num1 = scan.nextInt();
        System.out.println("enter second num");
        int num2 = scan.nextInt();

        int x = (num1 > num2) ? num1 : num2;

        System.out.println(x);
    }
}
