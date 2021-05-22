package day30_arrays;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class ForEachLoopArrays {
    public static void main(String[] args) {

        //indexes     0   1  2   3   4   5   6   7   8  9
        int[] nums = {32, 532, 12, 5454, 22, 123, 543, 999, 321, 3};


        System.out.println("----------FOR LOOP-------");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        System.out.println("------FOR EACH LOOP---------");

        for (int eachNum : nums) {
            System.out.print(eachNum + " ");
        }
        System.out.println();

        System.out.println("Last element: " + nums[nums.length - 1]);

        //LOOP ARRAY REVERSE

        //print all number backwards in same line
        for (int idx = nums.length - 1; idx >= 0; idx--) {
            System.out.print(nums[idx] + " ");
        }
    }
}
