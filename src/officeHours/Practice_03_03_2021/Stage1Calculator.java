package officeHours.Practice_03_03_2021;

/*
Make a class Stage1Calculator
create a main method

    - Declare two double variables
    - Declare 5 more double variables for each operation.
        > Execute all the operation between the first two numbers
    - Print out operations
        Ex: if the nums are 5 and 10
            5 + 10 = 15
            5 - 10 = -5
            etc..
 */

public class Stage1Calculator {
    public static void main(String[] args) {

        double num1=5;
        double num2=10;

        double suma = num1+num2;
        double resta = num1-num2;
        double multi = num1*num2;
        double division = num1/num2;
        double remainder = num1%num2;

        System.out.println("Calculation for "+num1+" and "+num2);

        System.out.println(num1+" + "+num2+" = "+suma);
        System.out.println(num1+" - "+num2+" = "+resta);
        System.out.println(num1+" * "+num2+" = "+multi);
        System.out.println(num1+" / "+num2+" = "+division);
        System.out.println(num1+" % "+num2+" = "+remainder);

    }
}
