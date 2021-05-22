package day06_arithmetic_operators;

public class MoreMathOper {
    public static void main(String[] args) {
        int toyota=431;
        int hondas=233;
        int vws=2;
        int teslas=20;
        int nissan=1;
        int bmw=155;
        int totalCarsInParking= toyota+hondas+vws+nissan+bmw+teslas;

        System.out.println("There are "+totalCarsInParking+" in the parking lot");

        String pizza="hawaiian";
        int slices=8;
        int guests=4;
        int slicesPerPerson=slices/guests;

        System.out.println("We ordered "+pizza+" pizza of "+slices+" slices for "+guests+" persons. They ate "+slicesPerPerson+" slices per person.");

    }
}
