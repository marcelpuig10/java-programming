package day38_methods;

public class StringUtils {
    public static void main(String[] args) {
        System.out.println("isNullOrEmpty(\"hello\") = " +  isNullOrEmpty("Hello"));
        String word = null;
        System.out.println("isNulOrEmpty(word) = " + isNullOrEmpty(word));
    }

    public static boolean isNullOrEmpty(String str){

        //return(str == null || str.isEmpty());
        if(str == null || str.isEmpty()){
            return true;

        }
        return false;

    }
}
