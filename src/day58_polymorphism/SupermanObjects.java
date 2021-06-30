package day58_polymorphism;

public class SupermanObjects {

    public static void main(String[] args) {
         Father spMan1= new Superman();
         spMan1.feedKid();
         spMan1.playWithKid();
         spMan1.raiseKid();

         Worker spMan2 = new Superman();
         spMan2.work("SDET");
        System.out.println("got paid "+ spMan2.getPaid());

        Superman spMan3 = new Superman();
        spMan3.getPaid();
        spMan2.work("scrum master");
        spMan3.feedKid();
        spMan3.playWithKid();
        spMan3.raiseKid();
    }
}
