package Replits;
import java.util.Scanner;
public class ComputerPrice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Screen size:");

        double screenSize = scan.nextDouble();

        double laptopPrice = 0.0;

        if (screenSize == 13.3) {
            laptopPrice = 200;
        } else if (screenSize == 15.0) {
            laptopPrice = 300;
        } else if (screenSize == 17.3) {
            laptopPrice = 400;
        }
        System.out.println("CPU Type");
        String cpu = scan.next();

        if (cpu.equals("i3")) {
            laptopPrice += 150;
        } else if (cpu.equals("i5")) {
            laptopPrice += 250;
        } else if (cpu.equals("i7")) {
            laptopPrice += 350;
        }
        System.out.println("RAM size");
        int ram = scan.nextInt();

        laptopPrice += 50 * (ram / 4);

        System.out.println("Storage type: SSD or HDD");
        String storageType = scan.next();
        System.out.println("Storage size");
        int storageSize = scan.nextInt();
        if (storageType.equalsIgnoreCase("SSD")) {

            //laptopPrice += 100 * (storageSize/500);
            // }else if(stor)


            System.out.println("laptopPrice = " + laptopPrice);

        }
    }
}