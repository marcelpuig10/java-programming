package day15_logicalops_switch_ternary;

public class CitySelector {
    public static void main(String[] args) {

        String city = "Tampa";

        if (city.equals("Moscow") || city.equals("Tampa")){
            System.out.println("Willing to relocate to "+city);
        }else{
            System.out.println("not going anywhere");
        }

        String teacher = "Saim";

        if (teacher.equals("Murodil") || teacher.equals("Saim")){
            System.out.println("is Java Class " + teacher);
        }else if (teacher.equals("Nadir")){
            System.out.println("Soft skills class " + teacher);
        }else {
            System.out.println("some class with Gurhan or Akbar");
        }

        String company = "Googlee";
        double salary = 100_000;

        if (company.equals("Google") || salary >= 100_000){
            System.out.println("accept job");
        }else{
            System.out.println("keep looking for a job");
        }
    }
}
