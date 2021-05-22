package Practicas;

public class greaterThan {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;

        String r = (a > b) ? " a is greater" : (b > a) ? "b is greater" : "a is equal to b";
        System.out.println(r);
    }
}
