package day49_static;

public class StaticMethods {
    //int num = 10; to see if I can use it in static method
    int num = 10;
    static int count =5;// I could call it because static

    public static void displayMessage(String message){


        System.out.println("message: " + message);
        //System.out.println("num: " + num); ERROR num is instance variable. static cant access
        System.out.println("count = " + count);

    }

    public static void anotherStaticMethod(){
        System.out.println("another static method");
        displayMessage("wooden spoon");
        //when static method can only call static variables or static methods

    }
    public void instanceMethod(){
        System.out.println("instanceMethod");
        System.out.println("num: " + num);
        System.out.println("count: " + count);
        displayMessage("wooden spoon");
    }


}
