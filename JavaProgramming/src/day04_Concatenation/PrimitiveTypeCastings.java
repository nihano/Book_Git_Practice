package day04_Concatenation;

public class PrimitiveTypeCastings {

    public static void main(String[] args) {

        // ---- Implicit Casting-----

        byte a = 15;

        short b = (short)a;

        int c = a; // implicit casting

        System.out.println(b);

        long d = 3000L;

        float f = d; // implicit casting

        // ----- Explicit Casting------

        int x =100;
        byte y = (byte)x; //explicit casting

        float z = 20.8f;

        short q = (short)z; // float is larger than short
        //short is designed for the whole numbers
        /*
        when float casted to short it will round it to 20

         */
        System.out.println(z);
        System.out.println(q);

        double n1 = 2.5;

        byte n2 = (byte) n1; //n1=2.5
        System.out.println(n2);//it will print n2 as 2

        System.out.println("------------------");

        int num = 500;

        byte result = (byte) num; //explicit casting

        System.out.println(result);
        /* max number in byte is 127
        it printed -12?
        make sure that value is within the smaller variable type range
        */

        int r = 50000;

        short t = (short) r;
        // short range's largest number is 32767
        //it will give some number after binary calculations?
        System.out.println(t);
        //we will mainly use int and double

        System.out.println("----------------------");

        double u = 3000.5;
        int p = (int) u;
        //option and enter is the shortcut for the casting options

        System.out.println(p);

        int o = 100;
        double d1 = o;
        System.out.println(d1);
        //printed 100.0 because double is decimal














    }



}
