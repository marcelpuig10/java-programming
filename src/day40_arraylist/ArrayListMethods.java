package day40_arraylist;
import java.util.*;

public class ArrayListMethods {
    public static void main(String[] args) {
        List<String> shoppingList = new ArrayList<>();
        System.out.println("size = " + shoppingList.size());
        System.out.println("is Empty? " + shoppingList.isEmpty());
        if (shoppingList.isEmpty()) {
            System.out.println("keep coding java");
        } else {
            System.out.println("List is not empty, code java then go to mall");
        }

        shoppingList.add("shoes");
        shoppingList.add("cheap monitor");
        shoppingList.add("wooden spoon");
        shoppingList.add("mask");
        shoppingList.add("scooter");
        shoppingList.add("java book");

        if (shoppingList.isEmpty()) {
            System.out.println("keep coding java");
        } else {
            System.out.println("List is not empty, code java then go to mall");

            int count = shoppingList.size();
            System.out.println("Items to buy =" + count);

            System.out.println("is shoes in my list? - " + shoppingList.contains("shoes"));

            if(shoppingList.contains("shoes")){
                System.out.println("shoes is in the list");
            }else {
                System.out.println("shoes is not in the list");
            }
            System.out.println("buying shoes ....$80");

            shoppingList.remove("shoes");
            System.out.println("shoppingList = " + shoppingList);

            System.out.println("done shopping, get back to coding");
            shoppingList.clear();
            System.out.println("shoppingList = " + shoppingList);


        }
    }
}
