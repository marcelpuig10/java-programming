package day05_primitives_concatanation;

public class BooleanPractice {
    public static void main(String[] args) {

        boolean isHungry=true;
        boolean isSleepy=false;
        boolean javaIsFun=true;
        boolean isBreakTime=true;

        System.out.println(isHungry);
        System.out.println(isSleepy);
        System.out.println(javaIsFun);
        System.out.println(isBreakTime);

        //System.out.println(isHungry+isBreakTime); ERROR
        System.out.println("isHungry"+isBreakTime);

        long a = 444L;
       // int b = a;

    }
}
