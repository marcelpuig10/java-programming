package day23_string_manipulation_white_loop;

public class FirstLoop {
    public static void main(String[] args) {
        int i = 10;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        int apples = 2;
        while(apples <=3){
            System.out.println("apples -> "+ apples);
            apples++;
        }
        System.out.println(apples);

        //infinite loop

       // while(true){
        //    System.out.println("hello world");


        int num1 = 4;
        int num2 = num1++;

        System.out.println("num1 "+num1);
        System.out.println("num2 "+num2);

        int myNumber = 44;
        myNumber++;
        System.out.println(myNumber); //45
        ++myNumber;
        System.out.println(myNumber); //46

        myNumber = 33;
        System.out.println(myNumber++); //33
        System.out.println(myNumber); //34

        int myNumber1 = 15;
        int yourNumber = ++myNumber1;

        System.out.println(myNumber1);
        System.out.println(yourNumber);


       int num = -5;
        System.out.print(num++ + ",");
        System.out.print(num = 0);
        System.out.print("," + --num);
        System.out.println("");

        short s = 13-9 / 3 * 10;
        s += -10;
        System.out.println(s);

        boolean one = ('a' != 'z') && false;
        boolean two = one || 0 == (9-10+1);
        System.out.println(two);

        long l = 100;
        short k =(short)l;
        System.out.println(k+10);

        int r =10;
        r = --r + r++ + r-- + r++;
        System.out.println(r);

        short d = 13+3 * (10-6) % 2;
        boolean p = d != 25;

        System.out.println(p);



        }
    }

