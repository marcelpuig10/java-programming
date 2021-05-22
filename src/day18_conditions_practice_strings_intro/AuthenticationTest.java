package day18_conditions_practice_strings_intro;

public class AuthenticationTest {
    public static void main(String[] args) {
        int last4SSN = 1234;
        int expectedSSN = 1234;

        int pinCode = 5678;
        int expectedPinCode = 5678;

        if (last4SSN == expectedSSN && pinCode == expectedPinCode) {
            System.out.println("Successful login");
            }else if(last4SSN==expectedSSN && pinCode!=expectedPinCode) {
            System.out.println("incorrect pincode");
            }else if (last4SSN!=expectedSSN && pinCode == expectedPinCode){
            System.out.println("incorrect SSN");
        }else {
            System.out.println("wrong pin code and SSN");
        }
    }
}
