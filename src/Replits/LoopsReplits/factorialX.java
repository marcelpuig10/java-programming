package Replits.LoopsReplits;
/*
In mathematics a factorial of a positive integer n, denoted by n!,
 is the product of all positive integers less than or equal to n.
 Calculate factorial and output result to the console.

Example:

input: 5
output: 120
n! = n* (n-1)!

5 * 4 * 3 * 2 * 1
 */

import java.util.Scanner;
public class factorialX {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int factorial = 1;

        while(n >= 1){
            factorial *= n;
            n--;

        }
        System.out.println("factorial = " + factorial);






    }
}
