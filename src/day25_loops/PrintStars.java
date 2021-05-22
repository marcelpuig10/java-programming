package day25_loops;

public class PrintStars {
    public static void main(String[] args) {
        for (int starts=1;starts <= 15;starts++){
            System.out.print("** ");
        }
        System.out.println();

        String myStars ="";
        for(int starts = 1; starts <= 5;starts++){
            myStars+= "* ";
        }

        System.out.println("My stars: "+ myStars);

    }
}
