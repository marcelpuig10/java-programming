package day20_string_manipulation;

public class ReplaceMethod {
    public static void main(String[] args) {
        String word = "java";

        String sentence = "java strings are fun";


        System.out.println(word.replace("a","u")); //juvu

        System.out.println(sentence.replace("java","python"));

        System.out.println(sentence.replace("fun","hard"));
    }
}
