package day49_static;

public class MyBankAccount {
    double balance = 500;
    String user;
    //double spend = balance*2;

    public void spend(double amount){
        System.out.println(user + " is spending $" + amount);
        balance -= amount;

    }

    public void showBalance(){
        System.out.println("Current balance = " + balance);
    }

}
