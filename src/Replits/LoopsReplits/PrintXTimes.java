package Replits.LoopsReplits;
import java.util.Scanner;

public class PrintXTimes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        while(n >0){
            System.out.print("*");
            n--;

        }

    }
}
