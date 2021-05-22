package day10_shortland_operators;

public class ChangeBalance {
    public static void main(String[] args) {
        double balance = 1230.55;
        System.out.println("balance= " + balance);

        double baklava = 22.50;
        System.out.println("baklava= " + baklava);
        //decrease balance by baklava price
        balance = balance - baklava;
        System.out.println("balance after baklava = " + balance);

        double kenafe = 44.45;
        System.out.println("kenafe = " + kenafe);
        balance = balance-kenafe;
        System.out.println("balance after kenafe= "+balance);

        kenafe = kenafe/2;
        System.out.println("kenafe = " + kenafe);

        balance= balance-kenafe;

        System.out.println("balance after second kenafe= "+ balance);

    }
}
