package day20_string_manipulation;

public class StringContains {
    public static void main(String[] args) {
        String word5 = "java";

        System.out.println(word5.contains("ja"));
        System.out.println(word5.contains("jv"));
        System.out.println(word5.contains("JA"));
        System.out.println(word5.contains("v"));

        String company = "Capital One";

        if(company.contains(" ")){
            System.out.println(" multiple words company name");
        }else{
            System.out.println("single word");
        }

        String etsyTitle = "Wooden spoon | Etsy";

        if(etsyTitle.contains(" | ")){
            System.out.println("title check PASS");
        }else{
            System.out.println("title check FAIL");
        }
        String firstName = "ahmed";
        //check if firstName contains "a" and "e" at same time.

        if(firstName.contains("a") && firstName.contains("e")){
            System.out.println("it does");
        }else{
            System.out.println("it does not");
        }

        if(firstName.contains("a") || firstName.contains("i")){
            System.out.println("it does contains a or i");
        }else{
            System.out.println("nor a or i is present");
        }
        String email = "marcel_puig@hotmail.com";

        if(email.contains("@") && email.endsWith(".com")){
            System.out.println("email accepted");
        }else{
            System.out.println("email incorrect");
        }
        //case insensitive contains
         if(email.toLowerCase().contains("d")){
             System.out.println("contains d");
         }else{
             System.out.println("does not contains d");
         }









    }
}
