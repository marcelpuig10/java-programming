package Practicas;

public class DivisibleBy {
    public static void main(String[] args) {
        int num = 15;
        if(num%2==0){
            System.out.println(num + " is divisible by 2");
        }else if(num%3==0){
            System.out.println(num + " is divisible by 3");
        }else if(num%5==0){
            System.out.println(num + " is divisible by 5");
        }
    }
}
