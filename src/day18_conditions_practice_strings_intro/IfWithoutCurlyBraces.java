package day18_conditions_practice_strings_intro;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class IfWithoutCurlyBraces {
    public static void main(String[] args) {
        String todaysClass = "java";

        if (todaysClass.equals("java"))
            System.out.println("java is fun");
        else
            System.out.println("it is not java. it is " + todaysClass);

        int a = 10;
        if (a==1)
            System.out.println("a is 1");

        System.out.println("1 is a");
    }
}
