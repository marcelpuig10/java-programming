package Replits;
import java.util.Scanner;

public class OverDoseCaffein {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter miligrams in drink:");

        int numOfMiligrams = scan.nextInt();

        int dose = (10*1000)/numOfMiligrams;
        System.out.println("It would take about "+ dose + " for a lethal overdose.");

    }
}
