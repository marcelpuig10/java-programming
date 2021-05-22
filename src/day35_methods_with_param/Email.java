package day35_methods_with_param;

public class Email {
    public static void main(String[] args) {
        buildEmail("Nadir", "verizon");
    }
    public static void buildEmail(String name, String domain){
        String email = name + "@" + domain + ".com";
        System.out.println(email);
        //System.out.println("Email: " + name + "@" + domain + ".com");

    }
}
