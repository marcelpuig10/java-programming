package day55_abstraction.exercise_example;

public abstract class exercise {
    public void start(){ //non-abstract method
        System.out.println("warming up and starting the exercise");

    }
    /**
     * -abstract method- without body/impl, just signature
     * -purpose: letting sub classes implement/override their own way

     */

    public abstract void perform();
    /**
     * @param minutes- how long is exercise is perform
     */
    public abstract int getCaloriesCount(int minutes);




}
