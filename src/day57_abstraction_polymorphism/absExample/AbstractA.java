package day57_abstraction_polymorphism.absExample;

public abstract class AbstractA {

    int num1;
    private double price;
    public static int count;
    public final String TYPE = "abstract";
    public static final String LANGUAGE = "java";

    public abstract void absMethodA();
    public void methodB() {
        System.out.println("methodB is called");
    }
    public static void staticMethodC() {
        System.out.println("static methodC is called");
    }
}