package day35_methods_with_param;

public class Counters {
    public static void main(String[] args) {
        count(5);
        //System.out.println();
        count(7);
        //System.out.println();
        count(2);
        int num2 = 99;
        count(num2);

        String word = "wooden spoon";
        count(word.length());
        printAge(1986);
        int newborn = 2020;
        printAge(newborn);


    }
    public static void count(int num) {
        for(int i = 0; i<= num; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void printAge(int year){
        int age = 2021 - year;
        System.out.println("Birth year: " + year + ". Age: " + age);
    }
}
