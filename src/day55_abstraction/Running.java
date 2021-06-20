package day55_abstraction;

public class Running extends exercise {
    @Override
    public void perform() {

    }

    /**
     *
     * @param minutes- how long is exercise is perform
     * @return we are assuming avg num of calories while running is 13
     */

    @Override
    public int getCaloriesCount(int minutes) {
        return minutes * 13;
    }

}
