package day45_oop;

public class Coffee {

    int amount;
    String type;

    public void refill() {
        int num = 100;
        amount = 100;

    }
    public void drink(int someAmount) {
        amount -= someAmount;

    }
    public void getAmount() {


    }
    public void setType(String newType) {
        type = newType;
    }

    public String getType() {
        return type;
    }
}
