package Practicas;

public class even_odd_number {
    public static void main(String[] args) {
        int number = 61;

        boolean even = number %2 == 0;
        boolean odd = !even;
        if(even){
            System.out.println(number + " is even number");
        }
        if(odd){
            System.out.println(number + " is odd");
        }
    }
}
