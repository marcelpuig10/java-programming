package day28_loops;
import java.util.Random;
public class RandomPassword {
    public static void main(String[] args) {
        String source = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_!@#$%^&*";
        //how many char for password : 8
        Random random = new Random();

        for (int i = 1 ; i <= 8; i++ ) {
            int index =  random.nextInt(71); //random num 0 - 70
            System.out.print(source.charAt(index));

            //System.out.println(random.nextInt(source.length()));

        }




    }
}
