package day26_for_loop;

public class StringLength {
    public static void main(String[] args) {
        String word = "application";

        System.out.println(word.length());

//        for(int i = 0 ; i < word.length(); i++){
//            System.out.print(word.charAt(i));

            for(int i = 10; i >= 0; i--){
                System.out.print(word.charAt(i));
            }
        }
    }

