package day46_encapsulation;

public class Car {
    private String model;
    private int year;
    private int mileage;

    //setter method for model
    public void setModel(String carModel) {
        model = carModel;
    }

    //getter method for model
    public String getModel(){
        return model;
    }
    //setter method for year
    public void setYear(int year){
        //year = carYear;
        this.year = year;
    }
    //getter method for year
    public int getYear(){
        return year;
    }
    //setter method for mileage
    public void setMileage(int mileage){
        this.mileage = mileage;
    }
    //getter method for mileage
    public int getMileage(){
        return mileage;
    }
}
