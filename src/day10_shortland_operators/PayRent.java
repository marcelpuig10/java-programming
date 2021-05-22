package day10_shortland_operators;
//NEXTLINE BUG
import java.util.Scanner;

public class PayRent {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter rent and month");
        double rent= scan.nextDouble();
        scan.nextLine();//hay que agregar esto para poder obtener toda la oracion en la sigt linea
        String month = scan.nextLine();
        System.out.println("rent= "+rent);
        System.out.println("month= "+month);

    }
}
