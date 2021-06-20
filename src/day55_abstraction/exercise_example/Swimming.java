package day55_abstraction.exercise_example;

import day55_abstraction.exercise_example.exercise;

public class Swimming  extends exercise { //swimming is concrete class-sub class os abstract exercise parent class
    @Override
    public void perform() {
        System.out.println("performing swimming in a pool or ocean");

    }

    @Override
    public int getCaloriesCount(int minutes) {
        return minutes * 11;
    }
}
