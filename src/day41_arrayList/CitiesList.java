package day41_arrayList;

import java.util.ArrayList;

public class CitiesList {
    public static void main(String[] args) {
        //declare arrayList
        ArrayList<String> cities = new ArrayList<>();

        //add values---> add cities to arrayList ---> add methods
        cities.add("Washington DC");
        cities.add("New York");
        cities.add("Vienna");
        cities.add("Adana");
        cities.add("LA");
        //add Ashgabath first index
        cities.add(0, "Ashgabat");
        //print all values in same line
        System.out.println(cities);
        System.out.println("first city " + cities.get(0));
        System.out.println("last city " + cities.get(5));
        System.out.println("last city " + cities.get(cities.size()-1));
        System.out.println(cities.size());
        int size = cities.size();
        System.out.println(size);

        //for loop and print all values in same line

        for(int i = 0; i < cities.size(); i++){
            System.out.println(cities.get(i)+"");
        }
        System.out.println();

        cities.remove(3);

        cities.remove("New York");
        System.out.println(cities);
        System.out.println();

        if(cities.isEmpty()){
            System.out.println("is empty");
        }


        if(cities.size() == 0){
            System.out.println("is empty");
        }

        cities.clear();

        System.out.println("after remove "+cities);

    }
}
