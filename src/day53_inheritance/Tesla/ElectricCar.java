package day53_inheritance.Tesla;

public class ElectricCar {

    private String model;
    private String make;
    private double price;
    private int year;
    private int range;
    private static int count;


    public ElectricCar(String model, String make, double price, int year, int range) {
        this.model = model;
        setMake(make); //this.make = make; is another way to set
        this.price = price;
        this.year = year;
        this.range = range;
        count++; //increase count by 1 -everytime new car is created

    }

    public static int getCount(){
        return count;

    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "model='" + model + '\'' +
                ", make='" + make + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", range=" + range +
                '}';
    }

    protected void drive(int miles){

        if(range == 0 || range - miles < 0){
            System.out.println(" ERROR");
        }else {
            range -= miles;
            System.out.println("Driving " + miles   + " miles...");
        }
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake(String make) {
        return make;
        }


    public void setMake(String make) {
        if(make.isEmpty()) {
            System.out.println("ERROR");
        }else{
            this.make = make;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
