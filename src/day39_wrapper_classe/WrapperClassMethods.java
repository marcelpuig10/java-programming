package day39_wrapper_classe;

public class WrapperClassMethods {
    public static void main(String[] args) {
        System.out.println(Integer.max(10,5));
        System.out.println(Integer.sum(50,35));
        System.out.println(Integer.min(5,2));
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Double.max(234.5,235));

        System.out.println(Double.compare(5,1));// 1 first larger than second
        System.out.println(Double.compare(5,5));// 0 both equal
        System.out.println(Double.compare(5,45));// -1 first is smaller

        System.out.println(Character.isDigit('8'));//true
        System.out.println(Character.isDigit('V'));//false
        System.out.println(Character.isDigit('Q'));//false

        System.out.println(Character.isAlphabetic('8'));//false
        System.out.println(Character.isAlphabetic('a'));//true

        System.out.println(Character.isLetter('a'));//true

        char letter = 'A';
        if(Character.isUpperCase(letter)) {
            System.out.println("it is uppercase");
        }
        String word = "JaVa iS Fun";
        for(int i = 0; i < word.length();i++){
            if(Character.isLowerCase(word.charAt(i))){
                System.out.print(word.charAt(i));
            }
        }
        System.out.println(Character.MIN_VALUE);
        System.out.println(Character.MAX_VALUE);

        System.out.println(Boolean.TRUE.equals(5>4));

        String strPrice = "54";
        int price = Integer.parseInt(strPrice);//convert string price into integer
        System.out.println(price);//54

        String strPrice2 = "129.99";
        double price2 = Double.parseDouble(strPrice2);
        System.out.println(price2);//129.99



    }
}
