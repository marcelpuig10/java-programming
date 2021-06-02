package day49_static;

public class StaticTest {
    String word = "word";
    static String word1 = "word";
    public static void main(String[] args) {
        //static methods can be called using classname
        StaticMethods.displayMessage("wooden spoon");
        //instance methods needs an object to be called
        //StaticMethods.instanceMethod(); ERROR
        StaticMethods stm = new StaticMethods();//we have to create object
        stm.instanceMethod();

        //static method can only access other static variables and methods
        //System.out.println(word);ERROR BECAUSE IS NOT INSIDE STATIC METHOD
        System.out.println(word1);//works because static variable
    }
}
