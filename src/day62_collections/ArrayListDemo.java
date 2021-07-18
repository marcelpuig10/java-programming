package day62_collections;

import java.util.*;


public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        List<String> cities = new ArrayList<>(); //polymorphism
        Collection<String> schools = new ArrayList<>();//polymorphism

        cities.add("McLean");//add method from collection or List inteface
        cities.add("Vienna");
        cities.add("NY");
        cities.add("NY");

        System.out.println("cities = " + cities);
        System.out.println("first city " + cities.get(0));
        System.out.println("count of cities = " + cities.size());


    }
}
