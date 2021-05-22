package Replits;
import java.util.Scanner;
public class TernaryResult {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number");
        int x = scan.nextInt();

        int result = (x > 5)? x : -x;

        System.out.println("result = " + result);
    }
}
