package Practicas;

public class ReversingArray {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        System.out.println("The original array is: ");
        //for(int i = 0; i < array1.length; i++)
        for(int each:array1) {
            System.out.print(each + " ");
        }
        System.out.println();
        System.out.println("The reverse array is: ");
        for(int i = array1.length-1; i >=0 ;i--){
            System.out.print(array1[i]+ " ");
        }
    }
}
