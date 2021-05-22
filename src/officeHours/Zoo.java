package officeHours;
//Practice 03.02.2021

public class Zoo {
    public static void main(String[] args) {
        String zooName= "Miami Zoo";
        String foundedDate= "March 1970";
        int startingHour= 9;
        int closingTime= 7;
        String holidays= "We are open";
        boolean aquaSection= true;
        int cats=125;
        int reptiles=100;
        int birds= 200;
        int employees= 503;
        int ticketsAdult= 49;
        int ticketsChildren= 25;
        String rules= "Do not feed the animals. No flash photos. Please!";

        System.out.println("*************************");
        System.out.println("****** WELCOME TO *******");
        System.out.println("*****  "+zooName+"  ******");

        System.out.println("Our Zoo was founded on "+foundedDate);
        System.out.println("We are very excited to announce you ----"+holidays+"----");
        System.out.println("Our new openings hours are: Everyday from "+startingHour+"am to "+closingTime+" pm");
        System.out.println("Are you wondering if we have an aqua section???"+aquaSection+" We do have one!");
        System.out.println("We also have numerous animals such as: "+cats+" cats, "+reptiles+" reptiles, "+birds+" birds and many many more.");
        System.out.println("All our animals are well care by "+employees+" animals lovers.");

    }
}
