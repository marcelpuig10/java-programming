package day38_methods;

public class MethodCallAnother {
    public static void main(String[] args) {
        star();
    }
    public static void star(){

        System.out.println("Start");
        continues();
    }
    public static void continues(){

        System.out.println("continue");
        end();
    }
    public static void end(){
        System.out.println("end");
    }
}
