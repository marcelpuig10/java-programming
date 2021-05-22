package day39_wrapper_classe;

import java.util.Arrays;

public class ParseString {
    public static void main(String[] args) {
        String strPrice = "54";
        int price = Integer.parseInt(strPrice);//convert string price into integer
        System.out.println(price);//54

        String strPrice2 = "129.99";
        double price2 = Double.parseDouble(strPrice2);
        System.out.println(price2);//129.99

        if(price2 > 100){
            System.out.println("expensive");
        }

        String sentence = "I wrote 100 lines of codes";
        //split
        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));

        int linesOfCode = Integer.parseInt(words[2]);
        System.out.println("lines of codes = " + linesOfCode);
    }
}
