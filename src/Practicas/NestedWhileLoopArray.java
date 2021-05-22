package Practicas;

public class NestedWhileLoopArray {
    public static void main(String[] args) {
        int i = 0;

        while (i < 5) {
            i++;
            int j = 0;
            while (j < 3) {
                j++;
                System.out.print(" |Row" + i + "-Column" + j);
            }
            System.out.println();
        }

        String[] names = {"ana", "luis", "juan", "alberto"};

        for (int k = 0; k < names.length; k++) {
            System.out.println("name: " + names[k]);
        }
    }
}
