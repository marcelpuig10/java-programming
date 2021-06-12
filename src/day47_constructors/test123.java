package day47_constructors;

public class test123 {
   static int a;
   int b;

    public static void main(String[] args) {

        test123 obj1 = new test123();
        obj1.b = 10;
        obj1.a = 20;

        test123 obj2 = new test123();
        obj2.b = 30;
        obj2.a = 40;

        System.out.println(obj1.a + " " + obj1.b);
        System.out.println(obj2.a + " " + obj2.b);
    }
}
