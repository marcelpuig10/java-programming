package day51_inheritance;

public class LyftRidesMain {
    public static void main(String[] args) {
        Lyft lyftRide = new Lyft();
      //  LyftXL lyftXLRide = new Lyft();
       // Lux luxRide = new Lyft();

        System.out.println("lyftRide for 5 miles = $" + lyftRide.calculateRate(5));
//        System.out.println("lyftXLRide for 5 miles = $" + lyftXLRide.calculateRate(5));
//        System.out.println("luxRide for 5 miles = $" + luxRide.calculateRate(5));
  }
}
