package day07_arithmeticOp_casting;

public class StringConcat {
    public static void main(String[] args) {
        System.out.println("java"+5+3);
        System.out.println("java"+(5+3));
        System.out.println(5+3);
        System.out.println(5+3+"java");
        System.out.println(5+"java"+3);
        System.out.println(3+"java");
        System.out.println(5+(3+"java"));
        System.out.println("hello"+1+2+3);
        System.out.println("hello"+(1+2+3));
        System.out.println("-------------------------------------------------------------------");
        int num1=7;
        int num2=8;
        System.out.println(num1+""+num2);
        System.out.println(num1+num2);
        System.out.println(num1+"8");

        System.out.println("------------------------------------------------------------");

        char char1='a';
        char char2='b';
        System.out.println(char1+char2);
        System.out.println(""+char1+char2);

    }
}
