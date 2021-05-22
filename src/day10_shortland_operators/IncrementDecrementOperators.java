package day10_shortland_operators;

public class IncrementDecrementOperators {
    public static void main(String[] args) {
        int i=1;
        i=i+1;
        System.out.println("i = " + i);
        i+=1;
        System.out.println("i = " + i);
        i++;
        System.out.println("i = " + i);

        //long a=30L;
        //long b= (short)a;
        //System.out.println(b);

        //float a=100.987_6543f;
        //short b=(byte)a;
        //byte c=(byte)b;
        //System.out.println(c);

        long a =3_000L;
        double b= (float)a;

        System.out.println(b);

        System.out.println("result b"+(1)+(2));

        System.out.println("5+2= "+4+3);



    }
}
