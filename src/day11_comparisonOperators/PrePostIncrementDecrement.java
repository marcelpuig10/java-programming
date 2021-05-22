package day11_comparisonOperators;

public class PrePostIncrementDecrement {
    public static void main(String[] args) {
        //Pre Increment
       int num1=10;
       int num2=++num1;
        System.out.println("num2 = " + num2);
        System.out.println("num1 = " + num1);

        //post Increment
        int num3=8;
        int num4=num3++;
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);

        int apples=5;
        int basket=++apples;
        System.out.println("apples = " + apples);
        System.out.println("basket = " + basket);

        int kiwi=8;
        int kiwiBasket=kiwi++;
        System.out.println("kiwi = " + kiwi);
        System.out.println("kiwiBasket = " + kiwiBasket);

        int cars=5;
        System.out.println(++cars);







    }
}
