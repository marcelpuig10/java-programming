package day17_ternary_continuation;

public class examples_Ternary {
    public static void main(String[] args) {

        int score= 80;
        String quality = "good";



        String result = (score > 60) ? "pass" : "fail";
        int x = (quality.equals("good")) ? 100 : 0;
        char grade = (score > 90) ? 'A' : 'B';
        String evenOdd = (score%2==0) ? "even" : "odd";

        System.out.println("score = " + x);
        System.out.println("result = " + result);
        System.out.println("evenOdd = " + evenOdd);
        System.out.println("grade = " + grade);



    }
}
