package day19_class_vs_object_strings;

public class ConversionMethod {
    public static void main(String[] args) {


        String word = "jaVa";
        String sentence = "123 Java is fun";

        System.out.println(word.toLowerCase());
        System.out.println(word.toUpperCase());
        System.out.println("JAVA".toLowerCase());
        System.out.println(sentence.toLowerCase());

        System.out.println();
        System.out.println();

        String company = "amazon";

        System.out.println(company.toUpperCase());
        System.out.println("company to uppercase - " + company.toUpperCase());
        System.out.println("java".toUpperCase());

        //change variable company "Amazon" to "AMAZON"

        System.out.println("company = " + company);

        company = company.toUpperCase();

        System.out.println("company = " + company);

        String name = "Nadir";
        System.out.println(name.length());
    }
}
