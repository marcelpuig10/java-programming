package day16_switch_ternary;

public class ElevatorV2 {
    public static void main(String[] args) {
        int floorNumber = 9;

        switch (floorNumber) {
            case 1:
                System.out.println("First floor");
                break;
            case 2:
                System.out.println("Second floor");
                break;
            case 3:
                System.out.println("Third floor");
                break;
            default:
                System.out.println("Invalid floor");
                break;

        }
    }
}
