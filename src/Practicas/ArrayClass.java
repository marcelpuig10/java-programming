package Practicas;

import java.util.Arrays;

public class ArrayClass {
    public static void main(String[] args) {
        int[] targetArrayObject = {11,4,6};
        int targetItemToSearch = 4;

        Arrays.sort(targetArrayObject);
        //System.out.println(Arrays.sort(targetArrayObject[]));
        System.out.println(targetArrayObject);
        Arrays.binarySearch(targetArrayObject,targetItemToSearch);
        Arrays.toString(targetArrayObject);
    }
}
