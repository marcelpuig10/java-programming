package day47_constructors;

public class Student {
    private String name;
    private int age;

    public Student(){
        System.out.println("no ar-args constructor");
    }
    public Student(String name) {
        System.out.println("with param constructor | name " + name);
    }

    public Student(int age){
        System.out.println("age param const | age = " + age);
    }

    public Student(String name, int age) {
        System.out.println("name and age param conts | " + name + "-" + age);
    }
}
