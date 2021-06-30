package day58_polymorphism;

import com.sun.javafx.collections.NonIterableChange;

public class Casting {
    public static void main(String[] args) {
        //variable of worker and object of superman

        Worker worker = new Superman();
        worker.work("QA Manager");
        worker.getPaid();

        ((Father)worker).raiseKid();
        ((Superman)worker).playWithKid();

        //DOWNCASTING FROM WORKER TO SUPERMAN
        //Superman superman =
    }
}
