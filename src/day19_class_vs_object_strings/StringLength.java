package day19_class_vs_object_strings;

public class StringLength {
    public static void main(String[] args) {
        String name = "Nadir";

        System.out.println(name.length());

        String word = "java";

        System.out.println(word.length());

        System.out.println("count = " + word.length());
        System.out.println("wooden spoon".length());
        System.out.println(name + "-" + name.length());

        System.out.println("------------------------------");

        String password = "abc1234";
        //If statement
        //when password is at least 6 characters
        //print: valid amazon password
        //ELSE
        //print password too short

        if(password.length() >= 6){
            System.out.println("valid amazon password");
        }else{
            System.out.println("password too short");
        }
    }
}
