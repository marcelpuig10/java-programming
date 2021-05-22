package day36_methodsWithReturn;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(add(5,2));
        double sum1 = add(5,1);
        System.out.println("sum1 = " + sum1);

        System.out.println(sustraction(4,3));
        System.out.println(multiplication(2,2));
        System.out.println(division(6,3));
        System.out.println(Calculator.add(5,4));

    }

    public static double add(double num1, double num2) {
        double sum = num1 + num2;
        return sum;
    }

    public static int sustraction(int num1, int num2) {
        int minus = num1 - num2;
        return minus;
    }

    public static int multiplication(int num1, int num2) {
        int multi = num1 * num2;
        return multi;
    }

    public static int division(int num1, int num2) {
        int div = num1 / num2;
        return div;
    }
}

