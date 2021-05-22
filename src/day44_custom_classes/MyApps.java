package day44_custom_classes;
//this class we use to create objects
public class MyApps {
    public static void main(String[] args) {
      //  String app1 = "uber"; this is string object. just characters

        App uberApp = new App(); //creating new object
        uberApp.name = "uber";
        uberApp.version = 3.5;
        uberApp.open(); //call open method using object variable
    }
}
