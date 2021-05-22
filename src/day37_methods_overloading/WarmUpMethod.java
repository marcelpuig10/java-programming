package day37_methods_overloading;

public class WarmUpMethod {

    public static void loginVoid(String userName, String password){
        String secretUserName = "cybertekStudent";
        String secretPassword = "abc123";

        if(userName.equalsIgnoreCase(secretUserName) && password.equalsIgnoreCase(secretPassword)){
            System.out.println("Pass: Login successful");
        }else{
            System.out.println("Fail: try again");
        }
    }
    public static void main(String[] args) {
        loginVoid("cybertekStudent", "abc123");
        loginVoid("cybertek", "abc123");
        loginVoid("","");
    }



}
