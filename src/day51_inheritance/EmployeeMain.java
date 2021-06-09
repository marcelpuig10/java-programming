package day51_inheritance;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee developer = new Employee();
        developer.jobTitle = "Java developer";
        System.out.println("developer.calculateSalary" + developer.calculateSalary(55.0));
        double annualDevSalary = developer.calculateSalary(55.0);
        System.out.println("annual dev salary = " + Math.round(55.0));


        Contractor sdetContractor = new Contractor();
        sdetContractor.jobTitle = "SDET";
        double sdetSalary = sdetContractor.calculateSalary(65);
        System.out.println("sdetSalary = " + sdetSalary);

        System.out.println(developer.toString());
        System.out.println(sdetContractor);
    }
}
