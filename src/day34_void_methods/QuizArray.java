package day34_void_methods;
import java.util.Arrays;
public class QuizArray {
    public static void main(String[] args) {
       int [] num1 ={15,30,45,60,75};
       num1[2] = num1[4];
       num1[4]= 90;
        System.out.println(Arrays.toString(num1));

       }



    }

