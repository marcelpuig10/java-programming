package Practicas;

public class assesement3 {
    public static void main(String[] args) {

        String num = String.valueOf(2.5);// num = "2.52
        int num1 = 2; //num1 = 2
        num += num1; // num = num num1 ====> num "2.5" + 2= "2.52"

        float num2 = Float.parseFloat(num);//unboxing : num2 = 2.52
        System.out.println(num2); // num2 == 2.52
        System.out.println(a(num2));

    }
    public static int a(int a){
        return 1;
    }
    public static int a(double a){
        return 2;
    }
    public static int a(String a){
        return 3;
    }

}

