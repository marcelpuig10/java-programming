package InterviewQuestions;

public class reverseString {
    public static void main(String[] args) {
        String str = "cdab";
        System.out.println(reverseStr(str));

    }
    public static String reverseStr(String str){

        //create empty String
        String reverseStr = "";

        //read through backwards(loop)
        for (int i = str.length()-1; i >= 0 ; i--) {
            reverseStr += str.charAt(i);
        }
        return reverseStr;
        //add character to empty String

    }
}
