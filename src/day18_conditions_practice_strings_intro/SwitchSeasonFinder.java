package day18_conditions_practice_strings_intro;

public class SwitchSeasonFinder {
    public static void main(String[] args) {

      /*  Winter: 12,1,2
        Spring: 3,4,5
        Summer: 6,7,8
        Fall:   9,10,11

        when month = 2;
        OUTPUT:
        "Winter"

        when month = 7;
        OUTPUT:
        "Summer"
                ----------------------
*/
        // Winter: 12,1,2

        int month = 1;
        if (month == 12 || month == 1 || month == 2) {
            System.out.println("Winter");
        }

        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
        }
    }
}
