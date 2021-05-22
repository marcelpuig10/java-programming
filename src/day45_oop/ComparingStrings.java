package day45_oop;

public class ComparingStrings {
    public static void main(String[] args) {
        String word1 = "java";//string pool
        String word2 = "java";//reuse from string pool
        String word3 = new String("java");//create in HEAP outside string pool
        String word4 = new String("java");//create new object in HEAP

        System.out.println(word1 == word2);//true both in string pool
        System.out.println(word1 == word3);//false word1 is in String pool and word3 in HEAP
        System.out.println(word3 == word4);//point different object

        System.out.println(word1.equals(word2));//true COMPARING VALUE
        System.out.println(word1.equals(word3));//true COMPARING VALUE
        System.out.println(word3.equals(word4));//true COMPARING VALUE

    }
}
