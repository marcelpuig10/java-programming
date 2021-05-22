package Replits.LoopsReplits;
import java.util.Scanner;

/*
In this assignment, you will write a program that will generate a shopping list. It's more advanced version of
assignment Shopping list I.

Your program should ask use to enter items followed by its price. After adding item, ask user if he wants to add
one more item. If so, repeat previous steps again. If no, print shopping list report and total price as show in
examples. Your program should accept up to 10 items.

Hint: use do while loop.
 */


public class ShoopingList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalPrice = 0;

        do{
            System.out.println("Item and price");
            item = scan.next();
            price = scan.nextDouble();
           shoppingListReport += item;
           totalPrice += price;
            System.out.println("do you want to add another item");
            countinue = scan.next();


        }while (countinue.equalsIgnoreCase("yes"));

        System.out.println("shoppingListReport = " + shoppingListReport + "\t ");
        System.out.println("totalPrice = " + totalPrice);
    }
}
