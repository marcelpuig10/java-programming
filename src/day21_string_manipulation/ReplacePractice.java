package day21_string_manipulation;

public class ReplacePractice {
    public static void main(String[] args) {
        String word = "github";
        System.out.println(word.replace("github","GITHUB"));
        System.out.println(word);

        System.out.println(word.replace("github", "gitlab"));
        System.out.println(word);
        word = word.replace("github", "gitlab");
        System.out.println(word);
        System.out.println(word.replace('i', 'o').replace('a','i'));

        String sentence = "java is fun";
        //String withNoSpaces ="";

       // withNoSpaces = sentence.replace(" ", "");
        //System.out.println(withNoSpaces);

        //String word2 = "java";
        //String word3 = "fun";
        sentence = sentence.replace("java","selenium").replace("fun","a lot of fun");

        System.out.println("sentence = " + sentence);

        //System.out.println(word2.replace("java","selenium"));
       // System.out.println(word3.replace("fun","a lot of fun"));

        String result = "1-48 of over 4,000 results for java book";

        result = result.replace("1-48 of over ","")
                        .replace(",","")
                        .replace(" results for java book","");
        System.out.println(result);


    }
}
