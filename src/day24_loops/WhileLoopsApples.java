package day24_loops;

public class WhileLoopsApples {
    public static void main(String[] args) {
        int apples = 1;

        while(apples<=10){
            System.out.println("eating one apple-> "+apples);
            apples++;
        }
        System.out.println(apples);
        System.out.println("no more apples");
    }
}
