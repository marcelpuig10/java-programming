package day26_for_loop;

public class WeekDays {
    public static void main(String[] args) {

        for(int day = 1; day <= 10; day++){
            switch(day){
                case 1:
                    System.out.println(day + " -Monday");
                    break;
                case 2:
                    System.out.println(day + " -Tuesday");
                    break;
                case 3:
                    System.out.println(day + " -Wenedsday");
                    break;
                case 4:
                    System.out.println(day + " -Thursday");
                    break;
                case 5:
                    System.out.println(day + " -Friday");
                    break;
                case 6:
                    System.out.println(day + " -Saturday");
                    break;
                case 7:
                    System.out.println(day + " -Sunday");
                    break;
                default:
                    System.out.println("no such day - java day -");

            }




//        int n = 1;
//        switch(n) {
//            case 1:
//                System.out.println(n + " -monday");
//                break;
//            case 2:
//                System.out.println(n + " -tuesday");
//                break;
//            case 3:
//                System.out.println(n + " -wendesday");
//                break;


        }
    }
}
