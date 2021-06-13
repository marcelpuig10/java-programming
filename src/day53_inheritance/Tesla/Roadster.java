package day53_inheritance.Tesla;

public class Roadster extends ElectricCar {
    public Roadster(String model, double price, int year, int range) {
        super(model, "Tesla", price, year, range);
        System.out.println("Welcome new roadster");

        Roadster roadster = new Roadster("Roadster", 20000 , 2022 , 620);
        System.out.println(roadster.toString());
        roadster.drive(1000);
        roadster.drive(600);
        System.out.println(roadster.getCount()); //static method is inherited



    }


}
