package day11_comparisonOperators;

public class BooleanComparison {

    public static void main(String[] args) {

        System.out.println(10 == 10);

        System.out.println(1000 > 100);

        System.out.println(985.44 < 98547.8);

        System.out.println(10 <=11);

        System.out.println(5 >= 3);

        System.out.println(-100 != 44);//!= means is not equal

        System.out.println("--------------------------------------------");

        int a = 100;
        int b = 200;
        System.out.println(a == b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(a != b);

        boolean result= 5==5;

        System.out.println("result = "+ result);

        result = 33 > 44;
        System.out.println("result = " + result);

        result = 88 < 99;
        System.out.println("result = " + result);

        

    }
}
