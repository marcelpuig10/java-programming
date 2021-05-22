package day46_encapsulation;

public class Dealership {
    public static void main(String[] args) {
        Car car1 = new Car();
       // car1.model = "Nissan Altima"; this dont work because is private.
        //car1.year = 2020;
        car1.setModel("Nissan Altima");
        System.out.println("car1 model = " + car1.getModel());

        car1.setYear(2020);
        System.out.println("year = " + car1.getYear());

        car1.setMileage(3000);
        System.out.println("mileage = " + car1.getMileage());
        System.out.println(car1.toString());
        System.out.println(car1);

        System.out.println("------------------------------------");

        Car alfaRomeo = new Car();
        alfaRomeo.setModel("Alfa Romeo Giulia Ti AWD");
        alfaRomeo.setYear(2017);
        alfaRomeo.setMileage(16604);

        System.out.println("model" + alfaRomeo.getModel());
        System.out.println("year " + alfaRomeo.getYear());
        System.out.println("mileage " + alfaRomeo.getMileage());



        }
    }

