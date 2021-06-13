package day53_inheritance;

public class ElectricCar {

    private String model;
    private String make;
    private double price;
    private int year;
    private int range;


    protected void drive(int miles){

        if(range == 0 || range - miles < 0){
            System.out.println(" ERROR");
        }else {
            range -= miles;
            System.out.println("Driving " + miles   + " miles...");
        }
    }

    public int getRage() {
        return range;
    }

    public void setRage(int rage) {
        this.range = rage;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
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
