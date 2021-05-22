package day35_methods_with_param;

public class MultipleParams {
    public static void main(String[] args) {
        showSum(10.05, 45.30);
    }
    public static void showSum(double num1, double num2){
        double sum = num1 +num2;
        System.out.println("The sum = "+ sum);
        System.out.println(" num1" + num1);
        System.out.println("num2:" + num2);
    }
}
