package day05_primitives_concatanation;

public class JobInfo {
    public static void main(String[] args) {
        String title="Java SDET";
        String company="Apple";
        String jobDescription="Experience in  Java, C++, Cucumber";
        int salary= 130000;
        int yearsExp=5;
        boolean hasBenefits=true;

        System.out.println("Title: "+title);
        System.out.println("Company: "+company);
        System.out.println("Job Description: "+jobDescription);
        System.out.println("Salary: $"+salary);
        System.out.println("Years of Experience: "+yearsExp+" years");
        System.out.println("Has Benefits: "+hasBenefits);
    }
}
