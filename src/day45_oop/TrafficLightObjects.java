package day45_oop;

public class TrafficLightObjects {
    public static void main(String[] args) {
        //create traffic light object

        TrafficLight trafficLight = new TrafficLight();
       // trafficLight.color = "red"; ***NOT GOOD PRACTICE***
        //WE WILL ASSIGN/UPDATE THE VALUE OF COLOR USING A METHOD OF THE CLASS
        trafficLight.changeColor("red");

        trafficLight.showColor();

        trafficLight.changeColor("green");

        trafficLight.showColor();

        TrafficLight trafficLight2 = new TrafficLight();
        trafficLight2.changeColor("brown");
        trafficLight2.showColor();

    }


}
