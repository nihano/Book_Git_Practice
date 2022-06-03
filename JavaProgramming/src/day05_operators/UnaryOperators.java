package day05_operators;

public class UnaryOperators {
    public static void main(String[] args) {
        // pre increment/decrement
        int x =10;

        System.out.println(++x);
        System.out.println(x);

        int y = 100;

        System.out.println(--y);
        System.out.println(y);

        System.out.println("-------------------------------");

        // post increment/decrement

        int a = 50;

        System.out.println(a++); // it will print 50 first
        System.out.println(a);

        int b = 25;
        System.out.println(b++); // it will print 25 first
        System.out.println(b);

        System.out.println("-----------------------------");

        int n = 30;

        int m = n++; // m = 30, n=31

        System.out.println(m);
        System.out.println(n);

        int z = 60;
        int q = z--;

        System.out.println(z);
        System.out.println(q);








    }
}
