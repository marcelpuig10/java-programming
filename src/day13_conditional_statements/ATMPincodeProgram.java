package day13_conditional_statements;

public class ATMPincodeProgram {
    public static void main(String[] args) {
        System.out.println("****WELCOME TO TD BANK ATM****");

        int secretCode=1234;
        int inputCode=1034;

        if (secretCode==inputCode) {
            System.out.println("Welcome to your account");
            System.out.println("You can withdraw, check your balance, make deposit");

        }else {
            System.out.println("wrong pin");
            System.out.println("try again");
        }
        System.out.println();
        System.out.println();

        System.out.println("***THANK YOU FOR CHOOSING TD BANK***");



    }
}
