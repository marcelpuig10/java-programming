package day20_string_manipulation;
import java.lang.*;


public class StringCreationMethods {
    public static void main(String[] args) {
        String word1= "potato";
        String word2 = new String("tomato");// different location in memory
        String word3= "";
        String word4 = new String();
        String car = "lexus";
        String city = "";

        System.out.println("word1 = " + word1);
        System.out.println("word2 = " + word2);
        System.out.println(car.isEmpty());
        System.out.println(city.isEmpty());
        System.out.println(city.length());
        System.out.println(city.equals(""));

    }
}
