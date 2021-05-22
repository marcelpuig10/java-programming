package officeHours;
//Practice 03.02.2021
public class PersonInfo {
    public static void main(String[] args) {

        String name= "John Smith";
        byte age= 43;
        char gender= 'M';
        boolean student= true;
        short numberOfSiblings= 2;
        long favoriteNumber= 10L;
        int numberOfSeasonsInYourArea= 1;
        double birthDate= 02.10;
        int year= 1986;
        String fullBirthdayDate= birthDate+"."+year;
        String favoriteQuote= "Salt also looks like sugar";

        System.out.println("Name: "+name+"\nAge: "+age+"\nGender: "+gender+"\nStudent? "+student);
        System.out.println("Siblings: "+numberOfSiblings+"\nFavorite Number: "+favoriteNumber);
        System.out.println("Number of seasons in your area: "+numberOfSeasonsInYourArea+"\nDOB: "+birthDate+" "+year);
        System.out.println("DOB: "+fullBirthdayDate);
        System.out.println("Favorite quote: \""+favoriteQuote+"\"");











    }
}
