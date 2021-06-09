package day51_inheritance;

public class Lux extends Lyft{

    @Override
    public double calculateRate(double miles){
        // calculate Rate of Lyft + 20 percent

        return super.calculateRate(miles) * 1.2;
    }

}
