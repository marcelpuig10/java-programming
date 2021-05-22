package day13_conditional_statements;

public class IFWithBooleanVariable {
    public static void main(String[] args) {
        boolean isHungry = false;

        if (isHungry == true){
            System.out.println("I am hungry I will go get something to eat");
            System.out.println("Then code java");
        } else{
            System.out.println("I am not hungry, lets continue coding");
        }

        double price= 234;
        boolean isAffordable = price <=200;
        System.out.println();
        System.out.println("isAffordable = " + isAffordable);
        if (isAffordable){
            System.out.println("I can afford it");
        }else{
            System.out.println("Too expensive for me");
        }
    }
}
