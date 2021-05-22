package day19_class_vs_object_strings;

public class StringComparison {
    public static void main(String[] args) {
        //String variable city and assign value

        String city = "Chicago";
        String word = "java";

        System.out.println(word.equals("java"));
        System.out.println(word.equals("JAVA"));
        System.out.println(word.equalsIgnoreCase("Java"));
        System.out.println(word.equalsIgnoreCase("JAVA"));
        System.out.println();

        System.out.println(city.equals("chicago"));
        System.out.println(city.equals("chicao"));
        System.out.println(city.equalsIgnoreCase("chicago"));
        System.out.println(city.equalsIgnoreCase("chicao"));

        if (city.equals("CHICAGO")){
            System.out.println("equals true");
        }else{
            System.out.println("equals false");
        }

        if (city.equalsIgnoreCase("CHICAGO")){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
