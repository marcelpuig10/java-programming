package day51_inheritance;

public class Employee {
    String jobTitle;


    public double calculateSalary(double hourlyRate){
        return 52 * 40 * hourlyRate * 1.1; // 52 weeks * 40 hours a week * rate * (bonus is 10%)

    }

    @Override
    public String toString() {
        return "Employee{" +
                "jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
