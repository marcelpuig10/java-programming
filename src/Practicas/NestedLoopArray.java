package Practicas;

public class NestedLoopArray {
    public static void main(String[] args) {
        //nested each loop
        int [] rows = {1,2,3,4};
        int[] cols = {1,2,3};
        for(int row:rows){
            for(int col:cols){
                System.out.print(" |Row:"+row+"-Column:"+ col);

            }
            System.out.println();
        }


    }
}
