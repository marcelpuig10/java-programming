package officeHours.Practice_03_08_2021;

import java.util.Scanner;


public class Rectangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("tell me the lenght");
        double length= scan.nextDouble();

        System.out.println("tell me the width");
        double width=scan.nextDouble();

        double perimeter = 2*(length+width);
        double area = length*width;

        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);

    }
}
