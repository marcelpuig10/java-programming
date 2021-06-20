package day55_abstraction.exercise_example;

public class FreeWeight extends Lifting {
    @Override
    public void endLift() {
        System.out.println("carefully re-rack dumbells");

    }

    @Override
    public void perform() {
        System.out.println("Lifting free weight dumbells");

    }

    @Override
    public int getCaloriesCount(int minutes) {
        return minutes * 6;
    }
}
