package day14_multi_branch_if_statements;
import java.util.Scanner;

public class CalculatorV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double num1, num2;
        char operator;

        System.out.println("Enter number");
        num1= scan.nextDouble();
        System.out.println("Enter operator");
        operator= scan.next().charAt(0);
        System.out.println("Enter number");
        num2= scan.nextDouble();

        if (operator == '+'){
            System.out.println("Result= " + (num1 + num2));
        }else if (operator == '-'){
            System.out.println("Result= " + (num1 - num2));
        }else if (operator == '*'){
            System.out.println("Result= "+ num1 * num2);
        }else if (operator == '/'){
            System.out.println("Result= " + num1/num2);
        }else if (operator == '%'){
            System.out.println("Result= " + num1%num2);
        }else {
            System.out.println("ERROR");
        }
    }
}
